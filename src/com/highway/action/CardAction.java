package com.highway.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.highway.biz.CardBiz;
import com.highway.biz.UserBiz;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;
import com.highway.entity.Card;
import com.opensymphony.xwork2.ActionSupport;

public class CardAction extends ActionSupport implements RequestAware,
		SessionAware {
	public Map<String, Object> request;
	public Map<String, Object> session;

	public void setRequest(Map<String, Object> requser) {
		this.request = requser;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	
	private CardBiz cardBiz;
	public CardBiz getCsrdBiz() {
		return cardBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.cardBiz = cardBiz;
	}
	
	
	public String selectCard(){
		return SUCCESS;
	}
	

	// 注册
	public String register() {
		
		card.setUser(user);
		infoApplication.setUser(user);
		infoApplication.setCard(card);
		return cardBiz.register(card,infoApplication);
	}

	public CardBiz getCardBiz() {
		return cardBiz;
	}

	public void setCardBiz(CardBiz cardBiz) {
		this.cardBiz = cardBiz;
	}


	public InfoApplication getInfoApplication() {
		return infoApplication;
	}

	public void setInfoApplication(InfoApplication infoApplication) {
		this.infoApplication = infoApplication;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	Card card;

	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	InfoApplication infoApplication;
	User user;
	
	String oldPassword,newPassword;
	int cardId;
	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	//修改储值卡密码
	public String changePassword(){
		return cardBiz.changePassword(cardBiz.searchById(cardId), oldPassword, newPassword);
	}
	
	InfoRecharge infoRecharge;//用于充值

	public InfoRecharge getInfoRecharge() {
		return infoRecharge;
	}

	public void setInfoRecharge(InfoRecharge infoRecharge) {
		this.infoRecharge = infoRecharge;
	}
	
	//充值
	public String recharge(){
		return  cardBiz.recharge(infoRecharge);
	}
}
