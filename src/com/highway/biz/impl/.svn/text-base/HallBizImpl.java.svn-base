package com.highway.biz.impl;

import java.util.List;

import com.highway.biz.HallBiz;
import com.highway.dao.HallDao;
import com.highway.entity.Hall;

public class HallBizImpl implements HallBiz {
	HallDao hallDao;



	public HallDao getHallDao() {
		return hallDao;
	}



	public void setHallDao(HallDao hallDao) {
		this.hallDao = hallDao;
	}


	//查询
	public List searchAllHall() {
		List list = hallDao.searchAllHall();

		return list;

	}
	
	//修改
	public String changeHall(Hall hall){
		
		return hallDao.changeHall(hall);
	}


    //增加营业厅
	public String addHall(Hall hall) {
		return hallDao.addHall(hall);
	}


    //删除营业厅
	public String delHall(Hall hall) {
		return hallDao.delHall(hall);
	}

}
