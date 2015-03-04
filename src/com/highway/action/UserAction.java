package com.highway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.highway.biz.UserBiz;
import com.highway.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements RequestAware,
		SessionAware {

	public Map<String, Object> request;
	public Map<String, Object> session;

	User user;
	
	public void setRequest(Map<String, Object> requser) {
		this.request = requser;
		//ÕÅÂ¶³¿

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	private UserBiz userBiz;

	public UserBiz getUserBiz() {
		return userBiz;
		
		
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	// ×¢²á
	public String register() {
		return userBiz.register(user);
	}
    //µÇÂ¼
	public String login(){
		User u = userBiz.searchUser(user);
		if(u!=null){
			session.put("user", u);
			System.out.println(u.getEmail());
			List cards = userBiz.searchCards(u);
			if(cards!=null){
				System.out.println("hello");
				session.put("uCards", cards);
				return "success";
			} 
		}
		return "login";
		
	}
	/**
	 * ×¢Ïú
	 *  @return
	 */
	public String loginout(){
		if(session.get("user")!=null){
			request.clear();
			session.clear();
			session.remove("user");
		}
		return "success";
	}
	


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	
	}
	

	
	
	String oldPassword,newPassword;
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

	//ÐÞ¸ÄÓÃ»§ÃÜÂë
	public String changePassword(){
		return userBiz.changePassword((User)session.get("user"), oldPassword, newPassword);
	}
	
	String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String changeAddress(){
		return userBiz.changeAddress((User)session.get("user"),address);
	}
	
	String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String changeEmail(){
		return userBiz.changeEmail((User)session.get("user"),email);
	}
	
}