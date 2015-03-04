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

	Encrypt des = new Encrypt();// 实例化一个对像

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
		
		des.getKey("highway123456");// 生成密匙
		System.out.println("key=highway123456");
		String strEnc = des.getEncString(card.getCardPassword());// 加密字符串,返回String的密文
		System.out.println("密文=" + strEnc);
		card
				.setCardPassword(strEnc + "|"
						+ Encrypt.Md5(card.getCardPassword()));
		if ("success".equals(infoapplicationDao.register(infoapplication))
				&& "success".equals(cardDao.register(card))) {
			// 如果成功往数据库中写入信息
			return "success";
		} else {
			return "error";
		}

	}

	public String recharge(InfoRecharge infoRec) {

    Card card = infoRec.getCard();
		if ("success".equals(cardDao.recharge(card, infoRec.getMoney()))&&"success".equals(infoRechargeDao.recharge(infoRec))) {
			//充值记录
			return "success";
		} else
			return "error";
	}
	
	//修改密码，验证原密码是否正确，然后修改新密码
	//输入参数中old为验证用原密码，xin为新密码，请通过数据库验证原密码而不是参数user中的密码
	public String changePassword(Card card, String old, String xin){
		String strEnc = des.getEncString(old);// 加密字符串,返回String的密文
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

	//删除卡片，需要在Card表删除数据并且在delete表添加记录
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
