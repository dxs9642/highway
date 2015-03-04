package com.highway.dao;

import java.util.Date;
import java.util.List;

import com.highway.entity.Card;
import com.highway.entity.InfoRecharge;

public interface InfoRechargeDao {
	//充值记录查询,该卡所有记录
	public List searchRecharge(Card card);
	
	//储值卡充值
	public String recharge(InfoRecharge infoRecharge);
	
	//充值记录查询，查询该卡起止时间内的记录
	public List searchRecharge(Card card,Date startTime,Date endTime);
	
	//查询所有充值记录
	public List searchAllRecharge();
	
	//查询充值记录，主要用于管理员，时间在startTime和endTIme之间，其他信息在infoRecharge中
	//如果时间信息只有一个，另一个取无穷
	public List searchRecharge(InfoRecharge infoRecharge,Date startTime,Date endTime);
	
	//修改充值记录，只有管理员可用
	public String change(InfoRecharge infoRecharge);
	
	
	
}
