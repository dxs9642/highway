package com.highway.biz.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.highway.biz.AdminBiz;
import com.highway.dao.AdministratorDao;
import com.highway.dao.CardDao;
import com.highway.dao.InfoConsumptionDao;
import com.highway.dao.InfoDeleteDao;
import com.highway.dao.InfoRechargeDao;
import com.highway.dao.InfoapplicationDao;
import com.highway.dao.UserDao;
import com.highway.entity.Administrator;
import com.highway.entity.Card;
import com.highway.entity.InfoApplication;
import com.highway.entity.InfoConsumption;
import com.highway.entity.InfoDelete;
import com.highway.entity.InfoRecharge;
import com.highway.entity.User;

public class AdminBizImpl implements AdminBiz {
	AdministratorDao adminDao;
	CardDao cardDao;
	InfoapplicationDao infoapplicationDao;
	InfoConsumptionDao infoConsumptionDao;
	InfoDeleteDao infoDeleteDao;
	InfoRechargeDao infoRechargeDao;
	UserDao userDao;
	
	
	

	public AdministratorDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdministratorDao adminDao) {
		this.adminDao = adminDao;
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public InfoapplicationDao getInfoapplicationDao() {
		return infoapplicationDao;
	}

	public void setInfoapplicationDao(InfoapplicationDao infoapplicationDao) {
		this.infoapplicationDao = infoapplicationDao;
	}

	public InfoConsumptionDao getInfoConsumptionDao() {
		return infoConsumptionDao;
	}

	public void setInfoConsumptionDao(InfoConsumptionDao infoConsumptionDao) {
		this.infoConsumptionDao = infoConsumptionDao;
	}

	public InfoDeleteDao getInfoDeleteDao() {
		return infoDeleteDao;
	}

	public void setInfoDeleteDao(InfoDeleteDao infoDeleteDao) {
		this.infoDeleteDao = infoDeleteDao;
	}

	public InfoRechargeDao getInfoRechargeDao() {
		return infoRechargeDao;
	}

	public void setInfoRechargeDao(InfoRechargeDao infoRechargeDao) {
		this.infoRechargeDao = infoRechargeDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// 注册,暂时不实现
	public String register(Administrator admin) {
		// TODO Auto-generated method stub
		return null;
	}
	// 查找管理员,主要用于登录
	public Administrator searchAdmin(Administrator admin) {
		Administrator ad = null;
		List list =adminDao.searchAdmin(admin);
		Iterator iter = list.iterator();
		if(iter.hasNext()){
			ad = (Administrator) iter.next();
		}
		return ad;
	}

	// 查询所有申请记录
	public List searchAllApplication() {
		return infoapplicationDao.searchAllApplication();
	}

	// 查询所有卡
	public List searchAllCard() {
		return cardDao.searchAllCard();
	}

	// 查询所有消费记录
	public List searchAllConsumption() {
		return infoConsumptionDao.searchAllConsumption();
	}

	// 查询所有删除记录
	public List searchAllDelete() {
		return infoDeleteDao.searchAllDelete();
	}

	// 查询所有充值记录
	public List searchAllRecharge() {
		return infoRechargeDao.searchAllRecharge();
	}

	// 查询所有用户
	public List searchAllUser() {
		return userDao.searchAllUser();
	}

	// 查询申请记录
	public List searchApplication(InfoApplication infoApplication) {
		return infoapplicationDao.searchApplication(infoApplication);
	}

	// 查询用户的所有卡
	public List searchCard(User user) {
		
		return cardDao.getCards(user);
	}

	// 查询储值卡,暂时不用，无必要的参数
	public List searchCard(Card card) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//查询余额在min和max之间的卡，只有一项为空的时候当作无穷
	public List searchCard(float min, float max) {
		
		return cardDao.searchCard(min, max);
	}

	// 查询消费记录
	public List searchConsumption(Date startTime,Date endTime,InfoConsumption infoConsumption) {
		
		return infoConsumptionDao.searchPay(infoConsumption.getCard(), startTime, endTime, infoConsumption);
	}

	// 查询删除记录
	public List searchDelete(InfoDelete infoDelete, Date start, Date end) {
		
		return infoDeleteDao.searchDelete(infoDelete, start, end);
	}

	// 查询充值记录
	public List searchRecharge(InfoRecharge infoRecharge, Date startTime,
			Date endTime) {
		
		return infoRechargeDao.searchRecharge(infoRecharge, startTime, endTime);
	}

	// 查询用户
	public List searchUser(User user) {
		
		return userDao.search(user);
	}

	

}
