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
	// ͨ�����Ų������Ѽ�¼
	public List searchPay(Card card) {
		// Hibernate QBC��ѯ
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// ��ʼ��session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// ��������
		criteria.add(Expression.eq("CardId", card.getCardId()));
		List list = criteria.list();
		return list;
	}

	public List searchPay(Card card, Date startTime, Date endTime) {
		// Expression.between(��age��,new Integer(21),new Integer(27));
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// ��ʼ��session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// ��������
		if (startTime.equals(null) && !endTime.equals(null))// �û�ֻ�����ֹ����
		{// Expression.le
			criteria.add(Expression.le("date", endTime));
		} else if (!startTime.equals(null) && endTime.equals(null))// �û�ֻ���뿪ʼ����
		{// Expression.ge
			criteria.add(Expression.ge("date", startTime));
		} else // �û���������
		{
			criteria.add(Expression.between("date", startTime, endTime));
		}

		// ������������ʼ����ֹ����֮������Ѽ�¼
		List list = criteria.list();
		return list;
	}

	// ͨ���ص��ѯ���Ѽ�¼ ������ɾ����
	public List searchPay(InfoConsumption infoConsumption) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// ��ʼ��session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// ��������
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
		.openSession();// ��ʼ��session

		Criteria criteria = session.createCriteria(InfoConsumption.class);// ��������
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

	// ��ѯ���е����Ѽ�¼
	public List searchAllConsumption() {

		List<InfoConsumption> IC = this.getHibernateTemplate().find("from InfoConsumption");
		return IC;
	}

	public String change(InfoConsumption infoConsumption) {
		// TODO Auto-generated method stub
		return null;
	}

}
