package com.highway.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.UserDao;
import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {



	// 注册方法
	public String register(User user) {
		super.getHibernateTemplate().save(user);
		return "success";
	}

	// 查找用户，用于登录
	public List search(final User user) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria criteria = session.createCriteria(User.class);
						if (null != user) {
							criteria.add(Example.create(user));
						}
						return criteria.list();
					}
				});
	}
//通过id查找user
	public User searchUser(int userId) {
	User use = (User)super.getHibernateTemplate().get(User.class, userId);
	return use;
		}

	public List searchAllUser() {

		List<User> us = this.getHibernateTemplate().find("from User");
		return us;
	}

	public String change(User user) {
	/*	Card ca = (Card) super.getHibernateTemplate().get(Card.class,
				card.getCardId());
		if(card.getCardPassword()!=null){
			//修改密码
		ca.setCardPassword(card.getCardPassword())	;
		}
		if(card.getMoney()!=null){
			ca.setMoney(card.getMoney());
			//修改余额
		}
		super.getHibernateTemplate().update(ca);*/
		 User us = super.getHibernateTemplate().get(User.class,
					user.getUserId());
		 System.out.println("yuan:"+us.getEmail());
		 System.out.println(user.getEmail());
		 if(user.getAddress()!=null){
			 us.setAddress(user.getAddress());
		 }
		 if(user.getEmail()!=null){
			 us.setEmail(user.getEmail());
		 }
		 if(user.getUserName()!=null){
			 us.setUserName(user.getUserName());
		 }
		 if(user.getUserPassword()!=null){
			us.setUserPassword(user.getUserPassword()); 
		 }
		 System.out.println("xin:"+us.getEmail());
		 super.getHibernateTemplate().update(us);
		 return "success";
	}

	public String changePassword(User user) {
       User us = super.getHibernateTemplate().get(User.class,
			user.getUserId());
       us.setUserPassword(user.getUserPassword());
       super.getHibernateTemplate().update(us);
       return "success";
	}

}
