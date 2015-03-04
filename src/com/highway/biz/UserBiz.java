package com.highway.biz;

import java.util.List;

import com.highway.entity.User;



public interface UserBiz {

	//ע��
	public String register(User user);
	
	//�����û�,��Ҫ���ڵ�¼
	public User searchUser(User user);
	
	//�鿴���ڶ�ӦUser�Ĵ�ֵ��
	public List searchCards(User user);
	
	//�޸����룬��֤ԭ�����Ƿ���ȷ��Ȼ���޸�������
	//���������oldΪ��֤��ԭ���룬xinΪ�����룬��ͨ�����ݿ���֤ԭ��������ǲ���user�е�����
	public String changePassword(User user, String old, String xin);

	public String changeAddress(User user, String address);

	public String changeEmail(User user, String email);
	

}
