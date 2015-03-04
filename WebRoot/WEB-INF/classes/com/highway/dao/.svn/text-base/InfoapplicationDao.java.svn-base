package com.highway.dao;

import java.util.List;

import com.highway.entity.InfoApplication;

public interface InfoapplicationDao {
	
	//添加卡片申请记录记录
	public String register(InfoApplication infoap);
	
	//查询所有申请记录
	public List searchAllApplication();
	
	//查询申请记录，条件在infoApplication中
	public List searchApplication(InfoApplication infoApplication);
	
	//按Id查找申请记录,在start和end之间Id，若只有一方，另一方取无穷
	public List searchApplication(int start, int end);
	
	//修改信息，只有管理员可用
	public String change(InfoApplication infoApplication);

}
 