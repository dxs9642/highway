package com.highway.dao;

import java.util.List;

import com.highway.entity.User;




public interface UserDao {
	
	//ע��
	public String  register(User user);
	
	//�����û�����Ҫ���ڵ�¼,Ҳ�������ڹ���Ա
	public List search(User user);
	
	//����UserId�����û�
	public User searchUser(int userId);

	//�������м�¼
	public List searchAllUser();
	
	
	//�޸��û���Ϣ
	public String change(User user);
	
	//�޸����룬��ʹ���¸�����ȡ��
	public String changePassword(User user);
	
	//ɾ���û�
	public String delUser(User user);

}
