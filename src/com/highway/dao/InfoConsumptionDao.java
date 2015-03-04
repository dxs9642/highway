package com.highway.dao;

import java.util.Date;
import java.util.List;

import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;

public interface InfoConsumptionDao {

	
	//���Ѽ�¼��ѯ
	public List searchPay(Card card);
	
	//���Ѽ�¼��ѯ����ѯ�ÿ���ֹʱ���ڵļ�¼
	public List searchPay(Card card,Date startTime,Date endTime);
	
	//��ѯ���Ѽ�¼����Ҫ���ڰ��ص��ѯ��Ҳ�����ڹ���Ա��������ѯ
	public List searchPay(InfoConsumption infoConsumption);
	
	//��ѯ���Ѽ�¼����ʱ��͵ص��ѯ���ص�ȡinfoConsumption�е�entrance��exit��spend����
	public List searchPay(Card card,Date startTime,Date endTime,InfoConsumption infoConsumption);
	
	//��ѯ�������Ѽ�¼
	public List searchAllConsumption();
	
	//�޸����Ѽ�¼��ֻ�й���Ա����
	public String change(InfoConsumption infoConsumption);
	
}
