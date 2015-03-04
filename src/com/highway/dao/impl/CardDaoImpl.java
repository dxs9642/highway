package com.highway.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.CardDao;
import com.highway.entity.Card;
import com.highway.entity.InfoDelete;
import com.highway.entity.User;

public class CardDaoImpl extends HibernateDaoSupport implements CardDao {
	// 注册方法
	public String register(Card card) {
		super.getHibernateTemplate().save(card);
		return "success";
	}

	public List getCards(User user) {
		// Hibernate QBC查询
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();

		Criteria criteria = session.createCriteria(Card.class);
		criteria.add(Expression.eq("user", user));
		// 查找符合UserId行
		List list = criteria.list();
		return list;
	}

	// 按照Id查找卡
	public Card searchCard(int cardId) {
		Card card = (Card) super.getHibernateTemplate().get(Card.class, cardId);
		return card;
	}

	// 查找所有卡
	public List searchAllCard() {

		List list = this.getHibernateTemplate().find("form Card");
		return list;
	}

	// 查询卡，条件在card中，但是不确定有什么属性 比较鸡肋（食之无味，弃之可惜）
	public List searchCard(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	public String recharge(Card card, float num) {
		// 找到需要操作的卡加上充值金额，然后保存；
		Card ca = this.searchCard(card.getCardId());
		if (!ca.equals(null)) {
			ca.setMoney(card.getMoney() + num);
			super.getHibernateTemplate().update(ca);
			return "success";
		} else
			return "error";
	}

	public List searchCard(float min, float max) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();// 初始化session

		Criteria criteria = session.createCriteria(Card.class);// 容器创建
		criteria.add(Expression.ge("money", min));
		criteria.add(Expression.ge("money", max));
		List list = criteria.list();
		return list;
	}

	public String changePassword(Card card) {
		// Card ca = this.searchCard(card.getCardId());//找到需要操作的卡
		Card ca = (Card) super.getHibernateTemplate().get(Card.class,
				card.getCardId());
		if(card.getCardPassword()!=null){
		ca.setCardPassword(card.getCardPassword());
		super.getHibernateTemplate().update(ca);
		return "success";}
		else return "error";
	}

	//修改信息
	public String change(Card card) {
		Card ca = (Card) super.getHibernateTemplate().get(Card.class,
				card.getCardId());
		if(card.getCardPassword()!=null){
			//修改密码
		ca.setCardPassword(card.getCardPassword())	;
		}
		if(card.getMoney()!=null){
			ca.setMoney(card.getMoney());
			//修改余额
		}
		super.getHibernateTemplate().update(ca);
		return "success";
	}

	//删除卡片
	public String delCard(Card card) {
		Card ca = super.getHibernateTemplate().get(Card.class, card.getCardId());
		super.getHibernateTemplate().delete(ca);
		return "success";
	}
	

}
