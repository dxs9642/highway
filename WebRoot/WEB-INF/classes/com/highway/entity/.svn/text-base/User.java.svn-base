package com.highway.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPassword;
	private String email;
	private String address;
	private Set cards = new HashSet(0);
	private Set infoApplications = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String userPassword, String email) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
	}

	/** full constructor */
	public User(String userName, String userPassword, String email,
			String address, Set cards, Set infoApplications) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.address = address;
		this.cards = cards;
		this.infoApplications = infoApplications;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getCards() {
		return this.cards;
	}

	public void setCards(Set cards) {
		this.cards = cards;
	}

	public Set getInfoApplications() {
		return this.infoApplications;
	}

	public void setInfoApplications(Set infoApplications) {
		this.infoApplications = infoApplications;
	}

}