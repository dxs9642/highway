package com.highway.entity;

import java.util.Date;

/**
 * InfoDelete entity. @author MyEclipse Persistence Tools
 */

public class InfoDelete implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer cardId;
	private Date date;

	// Constructors

	/** default constructor */
	public InfoDelete() {
	}

	/** full constructor */
	public InfoDelete(Integer userId, Integer cardId, Date date) {
		this.userId = userId;
		this.cardId = cardId;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCardId() {
		return this.cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}