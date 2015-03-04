package com.highway.biz;

import java.util.Date;
import java.util.List;

import com.highway.entity.Administrator;
import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoConsumption;
import com.highway.entity.InfoDelete;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;

public interface AdminBiz {
	
	//ע��
	public String register(Administrator admin);
	
	//���ҹ���Ա,��Ҫ���ڵ�¼
	public Administrator searchAdmin(Administrator admin);
	
	//���������û�
	public List searchAllUser();
	
	//�����û�
	public List searchUser(User user);
	
	//��ѯ���п�
	public List searchAllCard();
	
	//��ѯĳ�û����п�
	public List searchCard(User user);
	
	//��ѯ�����min��max֮��Ŀ���ֻ��һ��Ϊ�յ�ʱ��������
	public List searchCard(float min, float max);
	
	//��ѯ��
	public List searchCard(Card card);
	
	//��ѯ�������Ѽ�¼
	public List searchAllConsumption();
	
	//��ѯ���Ѽ�¼������������ʱ�䷶Χ���������Ϣ
	public List searchConsumption(Date startTime,Date endTime,InfoConsumption infoConsumption);
	
	//��ѯ���г�ֵ��¼
	public List searchAllRecharge();
	
	//��ѯ��ֵ��¼
	public List searchRecharge(InfoRecharge infoRecharge, Date startTime,
			Date endTime);
	
	//��ѯ���������¼
	public List searchAllApplication();
	
	//��ѯ�����¼
	public List searchApplication(InfoApplication infoApplication);
	
	//��ѯ����ɾ����¼
	public List searchAllDelete();
	
	//��ѯɾ����¼
	public List searchDelete(InfoDelete infoDelete, Date start, Date end);
	
	
	//���Card��Ϣ
	public String addCard(Card card);
	
	//��������¼
	public String addInfoApplication(InfoApplication infoApplication);
	
	//������û�
	public String addUser(User user);

	//�޸�Card��Ϣ
	public String changeCard(Card card);
	
	//�޸������¼
	public String changeInfoApplication(InfoApplication infoApplication);
	
	//�޸��û���Ϣ
	public String changeUser(User user);
	
	//ɾ����Ƭ
	public String delCard(Card card);
	
	//ɾ���û�
	public String delUser(User user);

}
