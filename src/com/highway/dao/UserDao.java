package com.highway.dao;

import java.util.List;

import com.highway.entity.User;




public interface UserDao {
	
	//注册
	public String  register(User user);
	
	//查找用户，主要用于登录,也可以用于管理员
	public List search(User user);
	
	//根据UserId查找用户
	public User searchUser(int userId);

	//查找所有记录
	public List searchAllUser();
	
	
	//修改用户信息
	public String change(User user);
	
	//修改密码，可使用下个方法取代
	public String changePassword(User user);
	
	//删除用户
	public String delUser(User user);

}
