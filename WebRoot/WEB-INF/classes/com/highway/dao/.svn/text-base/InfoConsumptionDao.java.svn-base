package com.highway.dao;

import java.util.Date;
import java.util.List;

import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;

public interface InfoConsumptionDao {

	
	//消费记录查询
	public List searchPay(Card card);
	
	//消费记录查询，查询该卡起止时间内的记录
	public List searchPay(Card card,Date startTime,Date endTime);
	
	//查询消费记录，主要用于按地点查询，也可用于管理员的条件查询
	public List searchPay(InfoConsumption infoConsumption);
	
	//查询消费记录，按时间和地点查询，地点取infoConsumption中的entrance，exit，spend属性
	public List searchPay(Card card,Date startTime,Date endTime,InfoConsumption infoConsumption);
	
	//查询所有消费记录
	public List searchAllConsumption();
	
	//修改消费记录，只有管理员可用
	public String change(InfoConsumption infoConsumption);
	
}
