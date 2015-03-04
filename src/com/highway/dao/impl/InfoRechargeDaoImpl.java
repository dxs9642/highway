package com.highway.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.InfoRechargeDao;
import com.highway.entity.Card;
import com.highway.entity.InfoConsumption;
import com.highway.entity.InfoRecharge;

public class InfoRechargeDaoImpl extends HibernateDaoSupport implements
		InfoRechargeDao {
	// 充值记录查询,该卡所有记录
	public List searchRecharge(Card card) {
		// Hibernate QBC查询
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();

		Criteria criteria = session.createCriteria(Card.class);
		criteria.add(Expression.eq("CardId", card.getCardId()));

		List list = criteria.list();
		return list;
	}

	// 充值记录查询，查询该卡起止时间内的记录
	public List searchRecharge(Card card, Date startTime, Date endTime) {
		// Expression.between(“age”,new Integer(21),new Integer(27));
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoRecharge.class);// 容器创建
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

	// 储值卡充值
	public String recharge(InfoRecharge infoRecharge) {
		super.getHibernateTemplate().save(infoRecharge);
		return "success";
	}

	// 查找所有的消费记录
	public List searchAllRecharge() {
		List list = this.getHibernateTemplate().find("from InfoRecharge");
		return list;
	}

	public List searchRecharge(InfoRecharge infoRecharge, Date startTime,
			Date endTime) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// 容器创建
	//	Criteria criteria1 = session.createCriteria(.class);// 容器创建
		if (startTime.equals(null)) {
			criteria.add(Expression.ge("date", startTime));
		}
		if (!endTime.equals(null)) {
			criteria.add(Expression.le("date", endTime));
		}
		criteria.add(Expression.eq("cardId", infoRecharge.getCard().getCardId()));
		List list = criteria.list();
		return list;
	}

	public String change(InfoRecharge infoRecharge) {
		InfoRecharge info = super.getHibernateTemplate().get(InfoRecharge.class, infoRecharge.getId());
		if(infoRecharge.getCard()!=null){
			info.setCard(infoRecharge.getCard());
		}
		if(infoRecharge.getDate()!=null){
			info.setDate(infoRecharge.getDate());
		}
		if(infoRecharge.getCreditId()!=null){
			info.setCreditId(infoRecharge.getCreditId());
		}
		if(infoRecharge.getMoney()!=null){
			info.setMoney(infoRecharge.getMoney());
		}
		super.getHibernateTemplate().update(info);
		return "success";
	}

}
