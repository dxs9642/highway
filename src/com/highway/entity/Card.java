package com.highway.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Card entity. @author MyEclipse Persistence Tools
 */

public class Card implements java.io.Serializable {

	// Fields

	private Integer cardId;
	private User user;
	private String cardPassword;
	private Float money;
	private Set infoRecharges = new HashSet(0);
	private Set infoApplications = new HashSet(0);
	private Set infoConsumptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Card() {
	}

	/** minimal constructor */
	public Card(User user, String cardPassword, Float money) {
		this.user = user;
		this.cardPassword = cardPassword;
		this.money = money;
	}

	/** full constructor */
	public Card(User user, String cardPassword, Float money, Set infoRecharges,
			Set infoApplications, Set infoConsumptions) {
		this.user = user;
		this.cardPassword = cardPassword;
		this.money = money;
		this.infoRecharges = infoRecharges;
		this.infoApplications = infoApplications;
		this.infoConsumptions = infoConsumptions;
	}

	// Property accessors

	public Integer getCardId() {
		return this.cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCardPassword() {
		return this.cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Set getInfoRecharges() {
		return this.infoRecharges;
	}

	public void setInfoRecharges(Set infoRecharges) {
		this.infoRecharges = infoRecharges;
	}

	public Set getInfoApplications() {
		return this.infoApplications;
	}

	public void setInfoApplications(Set infoApplications) {
		this.infoApplications = infoApplications;
	}

	public Set getInfoConsumptions() {
		return this.infoConsumptions;
	}

	public void setInfoConsumptions(Set infoConsumptions) {
		this.infoConsumptions = infoConsumptions;
	}

}