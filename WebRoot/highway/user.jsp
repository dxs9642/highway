<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.highway.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<% User user = (User)session.getAttribute("user");%>
<% if(user==null){
	out.print("<meta http-equiv=\"refresh\" content=\"3;url=http://localhost:8080/highway/highway/login.jsp\">");
} %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>个人资料</title>
<link type="text/css" href="/highway/highway/style.css" rel="stylesheet" />

</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="/highway/highway/index.jsp"></a></div>
		<div class="s_c">
<span style="float: right; color: red;">

<% 
	if(user!=null){
		out.print("欢迎你&nbsp;&nbsp;"+user.getUserName());
		out.print("&nbsp;&nbsp;<a href=\"/highway/user/logout\">注销</a>");
	}
	else
		out.print("&nbsp;&nbsp;<a href=\"/highway/highway/login.jsp\">登陆</a>|<a href=\"/highway/highway/register.jsp\">注册</a></span>");
 %>
 </span>
		</div>
	</div>
<!--top for end-->
<!--dh part start-->
	<div id="dh" class="clearfix">
		<ul>
			<li><a href="/highway/highway/index.jsp">网站首页</a></li>
			<li><a href="/highway/highway/user.jsp">个人资料</a></li>
			<li><a href="/highway/highway/card.jsp">存卡查看</a></li>
			<li><a href="/highway/highway/info_money.jsp">存卡充值</a></li>
			<li><a href="/highway/highway/info_consumption.jsp">消费记录</a></li>
			<li><a href="/highway/highway/info_recharge.jsp">充值记录</a></li>
			<li><a href="/highway/highway/contact.jsp">客服营业厅</a></li>
		</ul>
	</div>
<!--dh for end-->
<div class="blank8"></div>	
<!--content part start-->
	<div class="block clearfix">
		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="/highway/highway/index.jsp">网站首页</a><span>></span>个人资料<div class="update"><a href="updateUser.jsp">>>修改密码</a></div></div>
			<div class="main">
            <div class="blank8"></div>	
            <div class="blank8"></div>	
             <fieldset>
    <legend>个人资料</legend>
            <%
            String[] str = {"用户姓名","电子邮件","联系地址"};
            if(user!=null){
            	for(int i=0;i<str.length;i++){
            	    out.print("<div class=\"info\">");
            		out.print("<span style=\"float:left; padding-left:100px; font-size:20px; color:#333;\">"+str[i]+"&nbsp;&nbsp;</span>"+"<span style=\"float:left; font-size:20px; color:#red; padding-left:100px;\">");
            		switch(i){
            		case 0:
            		    out.print("&nbsp;&nbsp;");
            			out.print(user.getUserName());
            			break;
            		case 1:
            		    out.print("<a href=\"/highway/highway/email.jsp\">"+"<img src=\"/highway/highway/images/change.jpg\";/>"+"</a>");
            			out.print(user.getEmail());           			
            			break;
            		case 2:
            		    out.print("<a href=\"/highway/highway/address.jsp\">"+"<img src=\"/highway/highway/images/change.jpg\";/>"+"</a>");            		
            			out.print(user.getAddress());
            			break;
            		}
            		out.print("&nbsp;&nbsp;</span></div>");
            	}
            }else{
            	out.print("<a href=\"/highway/highway/login.jsp\" >你还没有登陆，正在跳转,如果没有跳转请点击这里--------></a>");
            }
             %>
             
			
			</fieldset>
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
