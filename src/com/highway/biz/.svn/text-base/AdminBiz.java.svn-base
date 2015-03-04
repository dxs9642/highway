package com.highway.biz;

import java.util.Date;
import java.util.List;

import com.highway.entity.Administrator;
import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoConsumption;
import com.highway.entity.InfoDelete;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;

public interface AdminBiz {
	
	//注册
	public String register(Administrator admin);
	
	//查找管理员,主要用于登录
	public Administrator searchAdmin(Administrator admin);
	
	//查找所有用户
	public List searchAllUser();
	
	//查找用户
	public List searchUser(User user);
	
	//查询所有卡
	public List searchAllCard();
	
	//查询某用户所有卡
	public List searchCard(User user);
	
	//查询余额在min和max之间的卡，只有一项为空的时候当作无穷
	public List searchCard(float min, float max);
	
	//查询卡
	public List searchCard(Card card);
	
	//查询所有消费记录
	public List searchAllConsumption();
	
	//查询消费记录，参数可以有时间范围，出入口信息
	public List searchConsumption(Date startTime,Date endTime,InfoConsumption infoConsumption);
	
	//查询所有充值记录
	public List searchAllRecharge();
	
	//查询充值记录
	public List searchRecharge(InfoRecharge infoRecharge, Date startTime,
			Date endTime);
	
	//查询所有申请记录
	public List searchAllApplication();
	
	//查询申请记录
	public List searchApplication(InfoApplication infoApplication);
	
	//查询所有删除记录
	public List searchAllDelete();
	
	//查询删除记录
	public List searchDelete(InfoDelete infoDelete, Date start, Date end);
	
	
	//添加Card信息
	public String addCard(Card card);
	
	//添加申请记录
	public String addInfoApplication(InfoApplication infoApplication);
	
	//添加新用户
	public String addUser(User user);

	//修改Card信息
	public String changeCard(Card card);
	
	//修改申请记录
	public String changeInfoApplication(InfoApplication infoApplication);
	
	//修改用户信息
	public String changeUser(User user);
	
	//删除卡片
	public String delCard(Card card);
	
	//删除用户
	public String delUser(User user);

}
