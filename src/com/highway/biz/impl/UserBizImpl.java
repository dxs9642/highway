package com.highway.biz.impl;

import java.util.Iterator;
import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.highway.biz.UserBiz;
import com.highway.dao.CardDao;
import com.highway.dao.UserDao;
import com.highway.entity.User;
import com.highway.utils.Encrypt;

public class UserBizImpl implements UserBiz {
	// ʹ��UserDao�ӿ���������userDao�������set����
	private UserDao userDao;
	Encrypt des = new Encrypt();

	public UserBizImpl() {
		des.getKey("highway123456");// �����ܳ�
	}

	private CardDao cardDao;

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String register(User user) {

		// ʵ����һ������

		System.out.println("key=highway123456");
		String strEnc = des.getEncString(user.getUserPassword());// �����ַ���,����String������
		user
				.setUserPassword(strEnc + "|"
						+ Encrypt.Md5(user.getUserPassword()));

		// String strDes = des.getDesString(strEnc);// ��String ���͵����Ľ���
		// System.out.println("����=" + strDes);

		if (userDao.register(user).equals("success")) {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			JavaMailSender mailSender = (JavaMailSender) context
					.getBean("mailSender");
			MimeMessage mailMessage = mailSender.createMimeMessage();
			try {
				MimeMessageHelper messgaeHelper = new MimeMessageHelper(
						mailMessage, true, "gbk");
				messgaeHelper.setFrom("highway1234@126.com");
				messgaeHelper.setTo(user.getEmail());

				messgaeHelper.setSubject("��ӭ����");
				messgaeHelper.setText("hello,java");
			} catch (Exception e) {
				e.printStackTrace();
			}
			mailSender.send(mailMessage);
			return "success";
		}
		return null;
	}

	public User searchUser(User user) {
		String st = user.getUserPassword();
		// ������ȡ�������ܺ�Ƚ�
		if (!st.equals(null)) {

			System.out.println(user.getUserPassword());
			String strEnc = des.getEncString(user.getUserPassword());// �����ַ���,����String������

			user.setUserPassword(strEnc + "|"
					+ Encrypt.Md5(user.getUserPassword()));
			System.out.println(user.getUserPassword());
		}
		User userz = null;
		List list = userDao.search(user);
		Iterator iter = list.iterator();
		if (iter.hasNext()) {
			userz = (User) iter.next();
		}
		return userz;
	}

	public List searchCards(User user) {
		System.out.println(user.getEmail());
		List list = cardDao.getCards(user);
		return list;
	}

	public String changePassword(User user, String old, String xin) {
		String strEnc = des.getEncString(old);// �����ַ���,����String������
		old = strEnc + "|" + Encrypt.Md5(old);
		System.out.println(old);
		if (user.getUserPassword().equals(old)) {
			user
					.setUserPassword(des.getEncString(xin) + "|"
							+ Encrypt.Md5(xin));
			System.out.println(user.getUserPassword());
			return userDao.change(user);

		}
		return "error";
	}
	
	public String changeAddress(User user,String address){
		if(address==null){
			address="";
		}
		user.setAddress(address);
		return userDao.change(user);
	}
	
	public String changeEmail(User user, String email){
		if(email==null||email.equals("")){
			return "failure";
		}
		user.setEmail(email);
		return userDao.change(user);
	}

}
