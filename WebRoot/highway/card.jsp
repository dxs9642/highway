
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.highway.entity.User"%>
<%@ page import="com.highway.entity.Card"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
	User user = (User)session.getAttribute("user");
	List cards = (List)session.getAttribute("uCards");
%>
<% if(user==null){
	out.print("<meta http-equiv=\"refresh\" content=\"3;url=http://localhost:8080/highway/highway/login.jsp\">");
} %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>存卡查看</title>
<link type="text/css" href="style.css" rel="stylesheet" />

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
		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.jsp">网站首页</a><span>></span>存卡查看<div class="update"><a href="cardApplication.jsp">>>申请卡</a></div></div>
			<div class="main">
            <div class="blank8"></div>	
            <div class="blank8"></div>	
 <div class="CardInfo"> 

<%
		if(user!=null){
			out.print("<div class=\"CardInfo\">");
			out.print("<span class=\"CardType\">卡类型:");
			out.print("<select>");
			
	        out.print("<option value=\"请选择\" selected==\"selected\">请选择卡号</option>");
			out.print("<option value=\"卡1\">卡1</option>");
			Card card;
			Iterator iter = cards.iterator();
			if (iter.hasNext()) {
				card = (Card) iter.next();
				out.print(card.getCardId());				
				out.print(card.getMoney());
			}
			
			out.print("</select>");
			out.print("</span>");
			out.print("</div>");
			out.print("<div class=\"registerBut\"> <a href=\"cardInfo.jsp\"><input type=\"reset\" value=\"确定\" class=\"inbuttn2\"></input></a> </div>");
		}else{
            	out.print("<a href=\"/highway/highway/login.jsp\" >你还没有登陆，正在跳转,如果没有跳转请点击这里--------></a>");

            }
		
 %>
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
=======
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
<title>存卡查看</title>
<link type="text/css" href="style.css" rel="stylesheet" />

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
		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.jsp">网站首页</a><span>></span>存卡查看<div class="update"><a href="cardApplication.jsp">>>申请卡</a></div></div>
			<div class="main">
            <div class="blank8"></div>	
            <div class="blank8"></div>	
			   <fieldset>
    <legend>存卡查询</legend>
<table id="mytable" cellspacing="0">
<caption>&nbsp;</caption>
  <tr>
    <th scope="col" class="nobg">查询卡列表</th>
    <th scope="col" abbr="Dual 1.8">余额</th>
    <th scope="col" abbr="Dual 2">详细信息</th>
  </tr>
  <tr>
    <th scope="row" abbr="Model" class="spec">卡1</th>
    <td>111</td>
    <td><a href="cardInfo.jsp">click</a></td>
  </tr>
  <tr>
    <th scope="row" class="specalt">卡2</th>
    <td class="alt">1111</td>
    <td class="alt"><a href="cardInfo.jsp">click</a></td>
  </tr>
  <tr>
    <th scope="row" class="spec">卡3</th>
    <td>1111</td>
    <td><a href="cardInfo.jsp">click</a></td>
  </tr>
</table>
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
>>>>>>> .r229
