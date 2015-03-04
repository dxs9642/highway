package com.highway.biz;

//import java.sql.Date;
//import java.util.*;

import java.util.Date;

import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;

public interface CardBiz {
	
	//申请储值卡方法,InfoApplicationDao在InfoApplication表添加记录，申请成功后调用CardDao在Card表添加卡片信息
	public String register( Card card,InfoApplication infoap);
	
	//储值卡充值，用CardDao的方法改变Card表的money，同时在InfoRecharge中
	public String recharge(InfoRecharge infoRecharge);
	
	//修改密码，验证原密码是否正确，然后修改新密码
	//输入参数中old为验证用原密码，xin为新密码，请通过数据库验证原密码而不是参数user中的密码
	public String changePassword(Card card, String old, String xin);
	
	//按cardId查询卡
	public Card searchById(int id);
	
	//删除卡片，需要在Card表删除数据并且在delete表添加记录
	public String delCard(Card card,Date date);

}
