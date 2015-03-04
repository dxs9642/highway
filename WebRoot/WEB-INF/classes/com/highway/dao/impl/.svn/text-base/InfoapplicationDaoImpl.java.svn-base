package com.highway.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.InfoapplicationDao;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoConsumption;

public class InfoapplicationDaoImpl extends HibernateDaoSupport implements
		InfoapplicationDao {

	public String register(InfoApplication infoap) {
		// 注册卡
		super.getHibernateTemplate().save(infoap);
		return "success";
	}

	// 查询所有申请记录
	public List searchAllApplication() {
		List list = this.getHibernateTemplate().find("form InfoApplication");
		return list;
	}

	// 查询申请记录，条件在infoApplication中,实现方式与其他略不统一
	public List searchApplication(InfoApplication infoApplication) {
		List list = null;
		boolean ad = false;
		String hql = "from InfoApplication ";
		if (infoApplication.getUser() != null) {
			if (!ad) {
				hql += " where ";
				ad = true;
			}
			hql += ("userId = '" + infoApplication.getUser().getUserId() + "' ");
		}
		if (infoApplication.getCard() != null) {
			if (!ad) {
				hql += " where ";
				ad = true;
			}
			hql += ("cardId = '" + infoApplication.getCard().getCardId() + "' ");
		}
		if (infoApplication.getUserName() != null) {
			if (!ad) {
				hql += " where ";
				ad = true;
			}
			hql += ("userName = '" + infoApplication.getUserName() + "' ");
		}
		if (infoApplication.getLicensePlateNumber() != null) {
			if (!ad) {
				hql += " where ";
				ad = true;
			}
			hql += ("licensePlateNumber = '"
					+ infoApplication.getLicensePlateNumber() + "' ");
		}
		if (infoApplication.getVehicleType() != null) {
			if (!ad) {
				hql += " where ";
				ad = true;
			}
			hql += ("vehicleType = '" + infoApplication.getVehicleType() + "' ");
		}
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		Transaction ts = session.beginTransaction();
		Query q = session.createQuery(hql);
		list = q.list();
		ts.commit();

		return list;
	}

	// 按Id查找申请记录,在start和end之间Id，若只有一方，另一方取无穷
	public List searchApplication(int start, int end) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(InfoApplication.class);// 容器创建
		if (start<=0 && end>0)// 用户只输入截止日期
		{// Expression.le
			criteria.add(Expression.le("id", end));
		} else if (start>0 && end<=0)// 用户只输入开始日期
		{// Expression.ge
			criteria.add(Expression.ge("id", start));
		} else // 用户正常输入
		{
			criteria.add(Expression.between("id", start, end));
		//	and Restrictions.conjunction()
		}

		// 查找所有在起始和终止日期之间的消费记录
		List list = criteria.list();
		return list;
	}

	public String change(InfoApplication infoApplication) {
		//修改用户信息，管理员使用
		super.getHibernateTemplate().update(infoApplication);
		return "success";
	}

}
