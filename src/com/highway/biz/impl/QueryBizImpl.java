package com.highway.biz.impl;

import java.util.Date;
import java.util.List;

import com.highway.biz.QueryBiz;
import com.highway.dao.InfoConsumptionDao;
import com.highway.dao.InfoRechargeDao;
import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;

public class QueryBizImpl implements QueryBiz {
	//
	private InfoRechargeDao infoRechargeDao;

	public InfoRechargeDao getInfoRechargeDao() {
		return infoRechargeDao;
	}

	public void setInfoRechargeDao(InfoRechargeDao infoRechargeDao) {
		this.infoRechargeDao = infoRechargeDao;
	}

	//
	private InfoConsumptionDao infoConsumptionDao;

	public InfoConsumptionDao getInfoConsumptionDao() {
		return infoConsumptionDao;
	}

	public void setInfoConsumptionDao(InfoConsumptionDao infoConsumptionDao) {
		this.infoConsumptionDao = infoConsumptionDao;
	}

	// 田：充值记录查询,查询该卡所有记录，调用InfoRechargeDao
	public List searchRecharge(Card card) {
		List list = infoRechargeDao.searchRecharge(card);

		return list;
	}
	//田：充值记录查询，查询该卡起止时间内的记录,调用InfoRechargeDao
	public List searchRecharge(Card card, Date startTime, Date endTime) {

		List list = infoRechargeDao.searchRecharge(card,startTime,endTime);

		return list;



	}

	// 消费记录查询,查询该卡所有记录，调用InfoConsusmptionDao by吴雪瑛
	public List searchPay(Card card) {
		List list = infoConsumptionDao.searchPay(card);

		return list;
	}

	// 消费记录查询，查询该卡起止时间内的记录,调用InfoConsumptionDao by吴雪瑛
	public List searchPay(Card card, Date startTime, Date endTime) {
		List list = infoConsumptionDao.searchPay(card,startTime,endTime);

		return list;
	}
	//消费记录查询，根据地点查询该卡在满足InfoConsumpation当中条件的记录 by吴雪瑛
	public List searchPay(Card card, InfoConsumption infoConsumption) {
		List list = infoConsumptionDao.searchPay(infoConsumption);

		return list;
	}

	
	

}
