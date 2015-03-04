package com.highway.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.AdministratorDao;
import com.highway.dao.CardDao;
import com.highway.entity.Administrator;
import com.highway.entity.User;

public class AdministratorDaoImpl extends HibernateDaoSupport implements
		AdministratorDao {

	public String register(Administrator admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public List searchAdmin(final Administrator admin) {
		//管理员用户登录
		return   super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria criteria = session.createCriteria(Administrator.class);
						if (null != admin) {

							criteria.add(Example.create(admin));
						}
						return criteria.list();
					}
				});
	}

}
