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
	// ע�᷽��
	public String register(Card card) {
		super.getHibernateTemplate().save(card);
		return "success";
	}

	public List getCards(User user) {
		// Hibernate QBC��ѯ
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();

		Criteria criteria = session.createCriteria(Card.class);
		criteria.add(Expression.eq("user", user));
		// ���ҷ���UserId��
		List list = criteria.list();
		return list;
	}

	// ����Id���ҿ�
	public Card searchCard(int cardId) {
		Card card = (Card) super.getHibernateTemplate().get(Card.class, cardId);
		return card;
	}

	// �������п�
	public List searchAllCard() {

		List list = this.getHibernateTemplate().find("form Card");
		return list;
	}

	// ��ѯ����������card�У����ǲ�ȷ����ʲô���� �Ƚϼ��ߣ�ʳ֮��ζ����֮��ϧ��
	public List searchCard(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	public String recharge(Card card, float num) {
		// �ҵ���Ҫ�����Ŀ����ϳ�ֵ��Ȼ�󱣴棻
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
				.openSession();// ��ʼ��session

		Criteria criteria = session.createCriteria(Card.class);// ��������
		criteria.add(Expression.ge("money", min));
		criteria.add(Expression.ge("money", max));
		List list = criteria.list();
		return list;
	}

	public String changePassword(Card card) {
		// Card ca = this.searchCard(card.getCardId());//�ҵ���Ҫ�����Ŀ�
		Card ca = (Card) super.getHibernateTemplate().get(Card.class,
				card.getCardId());
		if(card.getCardPassword()!=null){
		ca.setCardPassword(card.getCardPassword());
		super.getHibernateTemplate().update(ca);
		return "success";}
		else return "error";
	}

	//�޸���Ϣ
	public String change(Card card) {
		Card ca = (Card) super.getHibernateTemplate().get(Card.class,
				card.getCardId());
		if(card.getCardPassword()!=null){
			//�޸�����
		ca.setCardPassword(card.getCardPassword())	;
		}
		if(card.getMoney()!=null){
			ca.setMoney(card.getMoney());
			//�޸����
		}
		super.getHibernateTemplate().update(ca);
		return "success";
	}

	//ɾ����Ƭ
	public String delCard(Card card) {
		Card ca = super.getHibernateTemplate().get(Card.class, card.getCardId());
		super.getHibernateTemplate().delete(ca);
		return "success";
	}
	

}
