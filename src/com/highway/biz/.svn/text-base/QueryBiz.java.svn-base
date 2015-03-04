package com.highway.biz;

import java.util.Date;
import java.util.List;

import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;

/*
 * 查询方法
 */
public interface QueryBiz {
	
	//充值记录查询,查询该卡所有记录，调用InfoRechargeDao
	public List searchRecharge(Card card);
	
	//充值记录查询，查询该卡起止时间内的记录,调用InfoRechargeDao
	public List searchRecharge(Card card,Date startTime,Date endTime);
	
	//消费记录查询,查询该卡所有记录，调用InfoConsusmptionDao
	public List searchPay(Card card);
	
	//消费记录查询，查询该卡起止时间内的记录,调用InfoConsumptionDao
	public List searchPay(Card card,Date startTime,Date endTime);
	
	//消费记录查询，根据地点查询该卡在满足InfoConsumpation当中条件的记录
	public List searchPay(Card card, InfoConsumption infoConsumption);

}
