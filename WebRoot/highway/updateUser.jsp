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

<SCRIPT language=javascript>
	function checkPasswdOld(){
		var oldpwd=document.getElementById("oldpassword").value;
		if(oldpwd!=""){
			document.getElementById("passwdInOld").style.display="none";
		}else{
			document.getElementById("passwdInOld").style.display="inline";
			return false;
		}
		
	}


	function checkPasswd(){

		var newpwd=document.getElementById("password").value;
		var confirmpwd=document.getElementById("passwordAgain").value;
		
		if(confirmpwd!=""){
			document.getElementById("passwdIn2").style.display="none";
		}else{
			document.getElementById("passwdIn2").style.display="inline";
			document.getElementById("secondpwd").style.display="none";
		}
		
		if(newpwd!="")
		{
			document.getElementById("passwdIn").style.display="none";
			if(newpwd!=confirmpwd)
			{
				if(confirmpwd!=""){
					document.getElementById("secondpwd").style.display="inline";
				}
				return false;
				
			}else{
				document.getElementById("secondpwd").style.display="none";
				return true;
			}
		}
		else{
			document.getElementById("passwdIn").style.display="inline";
			return false;
		}
	}

	function checkSubmit(){
		if(checkPasswdOld()==false){
			if(checkPasswd()==false){
				return false;
			}
			return false;
		}
	}

</SCRIPT>

</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="/highway/highway/index.jsp"></a></div>
		<div class="s_c">
<span style="float: right; color: red;"><% 
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
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="/highway/highway/index.jsp">网站首页</a><span>></span>个人资料</div>
			<div class="main" >
            <div class="blank8"></div>
              
			   <fieldset>
    <legend>密码修改</legend>
            <%
            	if(user!=null){
            		out.print("<form action=\"/highway/user/changePassword\" method=\"post\" >");
            		for(int i=0;i<3;i++){
            			out.print("<div class=\"info\">");
            			out.print("<label class=\"item\">");
            			switch(i){
            				case 0:
            					out.print("原密码</label><input type=\"password\" class=\"intext2\" name=\"oldPassword\" id=\"oldpassword\" onblur=\"checkPasswdOld()\" />");
            					out.print("<div class=\"spancheck\"><span style=\"color:red;display:none;\" id=\"passwdInOld\">*密码不能为空！</span></div>");
            					break;
            				case 1:
            					out.print("输入新密码</label><input type=\"password\" class=\"intext2\" name=\"newPassword\" id=\"password\"  onblur=\"checkPasswd()\" />");
            					out.print("<div class=\"spancheck\"><span style=\"color:red;display:none;\" id=\"passwdIn\">*密码不能为空！</span></div>");
            					break;
            				case 2:
            					out.print("确认密码</label><input type=\"password\" class=\"intext2\" name=\"checkPassword\" id=\"passwordAgain\" onblur=\"checkPasswd()\" />");
            					out.print("<div class=\"spancheck\"><span style=\"color:red;display:none;\" id=\"secondpwd\">*两次密码不一致！</span><span style=\"color:red;display:none;\" id=\"passwdIn2\">*密码不能为空！</span></div>");
            					break;
            			}
            			out.print("</div>");
            		}
            		out.print("<div class=\"registerBut\"> ");
            		out.print(" <input type=\"submit\" value=\"确定\" class=\"inbuttn2\" ></input>");
            		
            	}else{
            		out.print("<a href=\"/highway/highway/login.jsp\" >你还没有登陆，正在跳转,如果没有跳转请点击这里--------></a>");
            		
            	}
             %>
             </fieldset>
</div>
		
		</div>
	</div>
	
<!--content for end-->	
<div class="blank8"></div>
	<s:fielderror />
<!--foot part start-->	
	<div id="foot" class="clearfix">
		上海公喜搬场版权所有 <span>地址：上海市沿浦路92号</span>
	</div>
<!--foot for end-->
</body>
</html>
