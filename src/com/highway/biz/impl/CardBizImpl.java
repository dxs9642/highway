package com.highway.biz.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highway.biz.CardBiz;
import com.highway.dao.CardDao;
import com.highway.dao.InfoDeleteDao;
import com.highway.dao.InfoRechargeDao;
import com.highway.dao.InfoapplicationDao;
import com.highway.dao.UserDao;
import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoDelete;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;
import com.highway.utils.Encrypt;

public class CardBizImpl implements CardBiz {
//cardDao infoapplicationDao infoRechargeDao
	private CardDao cardDao;
	private InfoapplicationDao infoapplicationDao;
	private InfoRechargeDao infoRechargeDao;
	private InfoDeleteDao infoDeleteDao;
	public InfoDeleteDao getInfoDeleteDao() {
		return infoDeleteDao;
	}

	public void setInfoDeleteDao(InfoDeleteDao infoDeleteDao) {
		this.infoDeleteDao = infoDeleteDao;
	}

	Encrypt des = new Encrypt();// ʵ����һ������

	public InfoRechargeDao getInfoRechargeDao() {
		return infoRechargeDao;
	}

	public void setInfoRechargeDao(InfoRechargeDao infoRechargeDao) {
		this.infoRechargeDao = infoRechargeDao;
	}

	public InfoapplicationDao getInfoapplicationDao() {
		return infoapplicationDao;
	}

	public void setInfoapplicationDao(InfoapplicationDao infoapplicationDao) {
		this.infoapplicationDao = infoapplicationDao;
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public String register(Card card, InfoApplication infoapplication) {
		
		des.getKey("highway123456");// �����ܳ�
		System.out.println("key=highway123456");
		String strEnc = des.getEncString(card.getCardPassword());// �����ַ���,����String������
		System.out.println("����=" + strEnc);
		card
				.setCardPassword(strEnc + "|"
						+ Encrypt.Md5(card.getCardPassword()));
		if ("success".equals(infoapplicationDao.register(infoapplication))
				&& "success".equals(cardDao.register(card))) {
			// ����ɹ������ݿ���д����Ϣ
			return "success";
		} else {
			return "error";
		}

	}

	public String recharge(InfoRecharge infoRec) {

    Card card = infoRec.getCard();
		if ("success".equals(cardDao.recharge(card, infoRec.getMoney()))&&"success".equals(infoRechargeDao.recharge(infoRec))) {
			//��ֵ��¼
			return "success";
		} else
			return "error";
	}
	
	//�޸����룬��֤ԭ�����Ƿ���ȷ��Ȼ���޸�������
	//���������oldΪ��֤��ԭ���룬xinΪ�����룬��ͨ�����ݿ���֤ԭ��������ǲ���user�е�����
	public String changePassword(Card card, String old, String xin){
		String strEnc = des.getEncString(old);// �����ַ���,����String������
		 old = strEnc+"|"+Encrypt.Md5(old);
			if(card.getCardPassword().equals(old)){
				card.setCardPassword(des.getEncString(xin)+"|"+Encrypt.Md5(xin));
				return cardDao.change(card);
			}
			return "error";
	}
	
	public Card searchById(int id){
		return cardDao.searchCard(id);
	}

	//ɾ����Ƭ����Ҫ��Card��ɾ�����ݲ�����delete����Ӽ�¼
	public String delCard(Card card,Date date) {
		if("success".equals(cardDao.delCard(card))){
			InfoDelete infoDelete = new InfoDelete();
			infoDelete.setCardId(card.getCardId());
			infoDelete.setUserId(card.getUser().getUserId());
			infoDelete.setDate(date);
			infoDeleteDao.addDelete(infoDelete);
			return "success";
		}
		return "error";
	}
}
