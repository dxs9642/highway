package com.highway.dao;

import java.util.List;

import com.highway.entity.Card;
import com.highway.entity.User;



public interface CardDao {
	//申请储值卡方法，先创建一个card，创建申请表，然后记录用户和卡的
	public String register(Card card);
	
	//储值卡充值
	public String recharge(Card card, float num);
	
	//根据CardId查找卡
	public Card searchCard(int cardId);
	
	//查看属于User的储值卡
	public List getCards(User user);
	
	//查询所有卡
	public List searchAllCard();
	
	//查询卡，条件在card中，但是不确定有什么属性
	public List searchCard(Card card);
	
	//查询余额在min和max之间的卡，只有一项为空的时候当作无穷，主要用于管理员
	public List searchCard(float min, float max);
	
	//修改密码
	public String changePassword(Card card);
	
	//修改信息
	public String change(Card card);
	
	//删除卡片
	public String delCard(Card card);

}
