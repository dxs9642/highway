package com.highway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.highway.biz.AdminBiz;
import com.highway.biz.UserBiz;
import com.highway.entity.Administrator;
import com.highway.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements RequestAware,
		SessionAware {
	public Map<String, Object> request;
	public Map<String, Object> session;
	Administrator admin;

	public Administrator getAdmin() {
		return admin;
	}

	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}

	public void setRequest(Map<String, Object> requser) {
		this.request = requser;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	
	public AdminBiz getAdminBiz() {
		return adminBiz;
	}

	public void setAdminBiz(AdminBiz adminBiz) {
		this.adminBiz = adminBiz;
	}

	AdminBiz adminBiz;
	UserBiz userBiz;
	
	public String searchAdmin(){
		//用于管理员登录
		Administrator ad = adminBiz.searchAdmin(admin);
		if(ad!=null){
			session.put("admin", ad);
			return "success";
		}
		return "login";
	}
	public String searchAllUser(){
		//找到所有用户
		List users = adminBiz.searchAllUser();
		if(users!=null){
			session.put("aUser", users);
			return "success";
		}
		return "error";
	}
	public String searchUser(){
		return null;
		
			
	}

}
