package com.highway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.highway.biz.HallBiz;
import com.highway.biz.QueryBiz;
import com.highway.entity.Hall;
import com.opensymphony.xwork2.ActionSupport;

public class HallAction extends ActionSupport implements RequestAware,
		SessionAware {

	public Map<String, Object> request;
	public Map<String, Object> session;

	public void setRequest(Map<String, Object> requser) {
		this.request = requser;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	private HallBiz hallBiz;
	private Hall hall;

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public void setHallBiz(HallBiz hallBiz) {
		this.hallBiz = hallBiz;
	}
    //查询
	public String searchAllHall() {

		List list = hallBiz.searchAllHall();
		session.put("getHallBiz", list);
		return "success";
		
	}
	//修改
	public String changeHall(){
		String string=hallBiz.changeHall(hall);
		return"success";
	}
	//增加营业厅
	public String addHall(){
		String str=hallBiz.addHall(hall);
		return "success";
	}
	
	//删除营业厅
	public String delHall(){
		String str=hallBiz.delHall(hall);
		return "success";
	}
	
}
