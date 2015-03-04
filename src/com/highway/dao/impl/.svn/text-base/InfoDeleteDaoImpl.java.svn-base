package com.highway.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.InfoDeleteDao;
import com.highway.entity.InfoConsumption;
import com.highway.entity.InfoDelete;

public class InfoDeleteDaoImpl extends HibernateDaoSupport implements
		InfoDeleteDao {

	public String addDelete(InfoDelete infoDelete) {
		// TODO Auto-generated method stub
		return null;
	}

	public List searchAllDelete() {
		// 查询所有删除信息
		List list = this.getHibernateTemplate().find("form InfoDelete");
		return list;
	}

	public List searchDelete(InfoDelete infoDelete, Date start, Date end) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoDelete.class);// 容器创建
		criteria.add(Expression.eq("cardId", infoDelete.getCardId()));
		if(!start.equals(null)){
			criteria.add(Expression.ge("date", start));
		}
		if(!end.equals(null)){
			criteria.add(Expression.le("date", end));
		}
//		criteria.add(Expression
//				.eq("cardId", infoRecharge.getCard().getCardId()));
		List list = criteria.list();
		return list;
	}

	//修改信息	
	public String change(InfoDelete infoDelete) {
		InfoDelete info = super.getHibernateTemplate().get(InfoDelete.class, infoDelete.getId());
		if(infoDelete.getCardId()!=null){
			info.setCardId(infoDelete.getCardId());
		}
		if(infoDelete.getDate()!=null){
			info.setDate(infoDelete.getDate());
		}
		if(infoDelete.getUserId()!=null){
			info.setUserId(infoDelete.getUserId());
		}
		super.getHibernateTemplate().update(info);
		return "success";
	}
}
