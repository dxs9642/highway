package com.highway.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.highway.dao.HallDao;
import com.highway.entity.Hall;
import com.highway.entity.User;

public class HallDaoImpl extends HibernateDaoSupport implements HallDao {
	// 查询
	public List searchAllHall() {
		List list = this.getHibernateTemplate().find("from Hall");
		return list;
	}

	// 修改
	public String changeHall(Hall hall) {

		Hall h = super.getHibernateTemplate().get(Hall.class, hall.getId());
		if (hall.getHalladress() != null) {
			h.setHalladress(hall.getHalladress());
		}
		if (hall.getHallarea() != null) {
			h.setHallarea(hall.getHallarea());
		}
		if (hall.getHallcity() != null) {
			h.setHallcity(hall.getHallcity());
		}
		if (hall.getHallname() != null) {
			h.setHallname(hall.getHallname());
		}
		if (hall.getHallphone() != null) {
			h.setHallphone(hall.getHallphone());
		}
		super.getHibernateTemplate().update(h);
		return "success";
	}

	// 增加营业厅
	public String addHall(Hall hall) {
		super.getHibernateTemplate().save(hall);
		return "success";
	}

	// 删除营业厅
	public String delHall(Hall hall) {
		// TODO Auto-generated method stub
		return null;
	}

}
