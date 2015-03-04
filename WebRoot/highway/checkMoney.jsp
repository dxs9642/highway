<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>存卡充值</title>
<link type="text/css" href="style.css" rel="stylesheet" />

</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="index.jsp"></a></div>
		<div class="s_c">
<span style="float: right; color: red;">欢迎你&nbsp;&nbsp;<?php echo $_SESSION['name']?>&nbsp;&nbsp;<a href="login.jsp">登陆|注销</a></span>
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
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.jsp">网站首页</a><span>></span>存卡充值</div>
			<div class="main">
            <div class="blank8"></div>	
            <div class="blank8"></div>	
            <span style="float:left; font-size:30px; color:#F00;">&nbsp;&nbsp;&nbsp;请确认信息：</span>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <div class="infoUser">
<span style="float:left; font-size:20px; color:#333;">充值卡号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<?php echo $_SESSION['cardId']?>&nbsp;&nbsp;</span>
            </div>
            <div class="infoUser">
<span style="float:left; font-size:20px; color:#333;">充值金额&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<?php echo $_SESSION['money']?>&nbsp;&nbsp;</span>
            </div>
                        <div class="registerBut"> 
            <a href="payMoney.jsp"><input type="reset" value="确定" class="inbuttn2" ></input></a>
</div>
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
