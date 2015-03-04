package com.highway.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.highway.biz.QueryBiz;
import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;
import com.opensymphony.xwork2.ActionSupport;

public class QueryAction extends ActionSupport implements RequestAware,
		SessionAware {

	public Map<String, Object> request;
	public Map<String, Object> session;

	public void setRequest(Map<String, Object> requser) {
		this.request = requser;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	private QueryBiz queryBiz;

	public void setQueryBiz(QueryBiz queryBiz) {
		this.queryBiz = queryBiz;
	}

	// 田：充值记录查询,查询该卡所有记录
	public String searchRecharge() {
		
		List list = queryBiz.searchRecharge(card);
		session.put("getQueryBiz", list);
		return "success";
	}
	//田：充值记录查询，查询该卡起止时间内的记录
	public String  searchRechargeTime() {

		List list = queryBiz.searchPay(card,startTime,endTime);
		session.put("searchRechargeTime", list);
		return "success";
	}

	// 声明card
	Card card;
	Date startTime;
	Date endTime;
	InfoConsumption infoConsumption;

	public InfoConsumption getInfoConsumption() {
		return infoConsumption;
	}

	public void setInfoConsumption(InfoConsumption infoConsumption) {
		this.infoConsumption = infoConsumption;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	// 消费记录查询,查询该卡所有记录 by吴雪瑛
	public String  searchPay() {

		List list = queryBiz.searchPay(card);
		session.put("searchPay", list);
		return "success";
	}

	//消费记录查询，查询该卡起止时间内的记录by吴雪瑛
	public String  searchPayTime() {

		List list = queryBiz.searchPay(card,startTime,endTime);
		session.put("searchPayTime", list);
		return "success";
	}
	//消费记录查询，查询该卡在满足infoConsumption当中条件的记录by吴雪瑛
	public String searchPayLoc(){

		List list = queryBiz.searchPay(card,infoConsumption);
		session.put("searchPayLoc", list);
		return "success";
	}
}
