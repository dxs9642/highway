package com.highway.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;

import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.highway.dao.InfoConsumptionDao;
import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;


public class InfoConsumptionDaoImpl extends HibernateDaoSupport implements
		InfoConsumptionDao {
	// 通过卡号查找消费记录
	public List searchPay(Card card) {
		// Hibernate QBC查询
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// 容器创建
		criteria.add(Expression.eq("CardId", card.getCardId()));
		List list = criteria.list();
		return list;
	}

	public List searchPay(Card card, Date startTime, Date endTime) {
		// Expression.between(“age”,new Integer(21),new Integer(27));
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// 容器创建
		if (startTime.equals(null) && !endTime.equals(null))// 用户只输入截止日期
		{// Expression.le
			criteria.add(Expression.le("date", endTime));
		} else if (!startTime.equals(null) && endTime.equals(null))// 用户只输入开始日期
		{// Expression.ge
			criteria.add(Expression.ge("date", startTime));
		} else // 用户正常输入
		{
			criteria.add(Expression.between("date", startTime, endTime));
		}

		// 查找所有在起始和终止日期之间的消费记录
		List list = criteria.list();
		return list;
	}

	// 通过地点查询消费记录 （可以删除）
	public List searchPay(InfoConsumption infoConsumption) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// 容器创建
		String str1 = "%"+infoConsumption.getEntrance()+"%";
		String str2 = "%"+infoConsumption.getExit()+"%";
		
		criteria.add(Expression.eq("entrance", str1));
		criteria.add(Expression.eq("exit", str2));
		
		List list = criteria.list();
		return list;
	}

	public List searchPay(Card card, Date startTime, Date endTime,
			InfoConsumption infoConsumption) {
		Session session = getHibernateTemplate().getSessionFactory()
		.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// 容器创建
		String str1 = "%"+infoConsumption.getEntrance()+"%";
		String str2 = "%"+infoConsumption.getExit()+"%";		
		criteria.add(Expression.eq("entrance", str1));
		criteria.add(Expression.eq("exit", str2));
		if(!startTime.equals(null)){
			criteria.add(Expression.ge("date", startTime));
		}
		if(!endTime.equals(null)){
			criteria.add(Expression.le("date", endTime));
		}
		List list = criteria.list();
		return list;
	}

	// 查询所有的消费记录
	public List searchAllConsumption() {

		List<InfoConsumption> IC = this.getHibernateTemplate().find("from InfoConsumption");
		return IC;
	}

	public String change(InfoConsumption infoConsumption) {
		// TODO Auto-generated method stub
		return null;
	}

}
