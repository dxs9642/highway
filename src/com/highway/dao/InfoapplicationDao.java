package com.highway.dao;

import java.util.List;

import com.highway.entity.InfoApplication;

public interface InfoapplicationDao {
	
	//��ӿ�Ƭ�����¼��¼
	public String register(InfoApplication infoap);
	
	//��ѯ���������¼
	public List searchAllApplication();
	
	//��ѯ�����¼��������infoApplication��
	public List searchApplication(InfoApplication infoApplication);
	
	//��Id���������¼,��start��end֮��Id����ֻ��һ������һ��ȡ����
	public List searchApplication(int start, int end);
	
	//�޸���Ϣ��ֻ�й���Ա����
	public String change(InfoApplication infoApplication);

}
 