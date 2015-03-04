<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>用户注册</title>
<link type="text/css" href="style.css" rel="stylesheet" />
</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="index.jsp"></a></div>
		<div class="s_c">
<span style="float: right; color: red;">欢迎你&nbsp;&nbsp;<?php -- ?>&nbsp;&nbsp;<a href="login.jsp">登陆|注销</a></span>
		</div>
	</div>
<!--top for end-->
<!--dh part start-->
	<div id="dh" class="clearfix">
		<ul>
			<li><a href="index.jsp">网站首页</a></li>
			<li><a href="user.jsp">个人资料</a></li>
			<li><a href="card.jsp">存卡查看</a></li>
			<li><a href="info_money.jsp">存卡充值</a></li>
			<li><a href="info_consumption.jsp">消费记录</a></li>
			<li><a href="info_recharge.jsp">充值记录</a></li>
			<li><a href="contact.jsp">客服营业厅</a></li>
		</ul>
	</div>
<!--dh for end-->
<div class="blank8"></div>	
<!--content part start-->
	<div class="block clearfix">
		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.jsp">网站首页</a><span>></span>用户注册<span>></span>储值卡申请</div>
			<div class="main" >
            <div class="blank8"></div>
                        <div class="info">
            <label class="item">车主姓名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" class="intext2" name="userName" />
			</div>
            	        <div class="info">
            <label class="item">车牌号码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" class="intext2" name="license_plate_number" />
			</div>
            
                        	        <div class="info">
            <label class="item">车辆类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" class="intext2" name="vehicle_type" />
			</div>
            	        <div class="info">
            <label class="item">卡片密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="password" class="intext2" name="password" />
			</div>
                        <div class="info">
            <label class="item">确认密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="password" class="intext2" name="checkPassword" />
			</div>
            	        <div class="info">
            <label class="item">卡片接收地址&nbsp;&nbsp;</label><input type="text" class="intext2" name="adress" />
			</div>
            <div class="registerBut"> 
            <a href="cardSuccess.jsp"><input type="reset" value="确定" class="inbuttn2"></input></a>
</div>
		</div>
	</div>
<!--content for end-->	
<div class="blank8"></div>
<!--foot part start-->	
	<div id="foot" class="clearfix">
		上海公喜搬场版权所有 <span>地址：上海市沿浦路92号</span>
	</div>
<!--foot for end-->
</body>
</html>
