package com.highway.biz;

import java.util.List;

import com.highway.entity.User;



public interface UserBiz {

	//注册
	public String register(User user);
	
	//查找用户,主要用于登录
	public User searchUser(User user);
	
	//查看属于对应User的储值卡
	public List searchCards(User user);
	
	//修改密码，验证原密码是否正确，然后修改新密码
	//输入参数中old为验证用原密码，xin为新密码，请通过数据库验证原密码而不是参数user中的密码
	public String changePassword(User user, String old, String xin);

	public String changeAddress(User user, String address);

	public String changeEmail(User user, String email);
	

}
