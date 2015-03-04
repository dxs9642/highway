<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>用户注册</title>
<link type="text/css" href="/highway/highway/style.css" rel="stylesheet" />

<SCRIPT language=javascript>
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
	function checkMail(str){ 
		var strReg=""; 
		var r; 
		var strText=document.getElementById("email").value; 
		strReg=/^\w+((-\w+)|(\.\w+))*\@{1}\w+\.{1}\w{2,4}(\.{0,1}\w{2}){0,1}/ig;
		r=strText.search(strReg); 
		if(r==-1) { 
			document.getElementById("emailIn").style.display="inline";
			return false;
		} else{
			document.getElementById("emailIn").style.display="none";
		return true;
		}
	}
	function checkUser(){
		var username=document.getElementById("username").value;
		if(username!=""){
			document.getElementById("userIn").style.display="none";
			var len = 0;
						
			var reg = /^[\u4E00-\u9FA5]{1,10}$/; 
			
			for(var i=0; i<username.length; i++){   
			   if(username.charCodeAt(i)>255 || username.charCodeAt(i)<0){  
			       len +=2;  
			   }
			}
			if(!reg.test(username)){
		  		document.getElementById("userchinese").style.display="inline";
		  		return false;
		  	}else{
		  		document.getElementById("userchinese").style.display="none";
		  		return true;
		  	}
		}else{
			document.getElementById("userIn").style.display="inline";
			document.getElementById("userlength").style.display="none";
		  	document.getElementById("userchinese").style.display="none";
		}
	}
	function checkSubmit(){
		if(checkPasswd()==false){
			var emailads = document.getElementById("email").value;
			if(checkMail(emailads)==false){
				if(checkUser()==false){
					return false;
				}
				return false;
			}
			return false;
		}
		return true;
	}

</SCRIPT>

</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="/highway/highway/index.jsp"></a></div>
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

		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.html">网站首页</a><span>></span>用户注册</div>
			<div class="main" >
            <div class="blank8"></div>

	            <form action="/highway/user/register" method="post"  onsubmit="return checkSubmit();">
	            
			   <fieldset>
    <legend>用户注册</legend>
    <p><strong style="font-size:16px;">您的电子邮箱不会被公布出去,但是必须填写.</strong> 在您注册之前请先认真阅读服务条款.</p>
			        <div class="blank8"></div>
			        <div class="info" >
		            		<label class="item">用户姓名&nbsp;&nbsp;&nbsp;</label>
		            		<input type="text" class="intext2" name="user.userName" id="username" onblur="checkUser()"></input>
						<div class="spancheck">
							<span style="color:red;display:none;" id="userIn" >*用户名不能为空！</span>
							<span style="color:red;display:none;" id="userchinese" >*不是正确的字符格式！</span>							
						</div>		
					</div>
		            <div class="info">
		            	<label class="item">输入密码&nbsp;&nbsp;&nbsp;</label>
		            	<input type="password" class="intext2" name="user.userPassword" id="password" onblur="checkPasswd()"></input>
						<div class="spancheck">
							<span style="color:red;display:none;" id="passwdIn">*密码不能为空！</span>
						</div>
					</div>
		           <div class="info">
		            	<label class="item">确认密码&nbsp;&nbsp;&nbsp;</label>
		            	<input type="password" class="intext2" id="passwordAgain" name="passwordAgain" onblur="checkPasswd()"></input>
						<div class="spancheck">
							<span style="color:red;display:none;" id="secondpwd">*两次密码不一致！</span>
							<span style="color:red;display:none;" id="passwdIn2">*密码不能为空！</span>
						</div>
					</div>
		            <div class="info">
		            	<label class="item">电子邮件&nbsp;&nbsp;&nbsp;</label>
		            	<input type="text" class="intext2" name="user.email" id="email" onblur="checkMail('email')"></input>
						<div class="spancheck">
							<span style="color:red;display:none;" id="emailIn">*邮箱格式错误！</span>
						</div>
					</div>
		            <div class="info">
			            <label class="item">实际住址&nbsp;&nbsp;&nbsp;</label>
			            <input type="text" class="intext2" name="user.address"></input>
					</div>					     
      <p style="font-size:16px;"><input type="checkbox" name="AgreeToTerms" id="AgreeToTerms" value="1" />
      <a href="#" title="您是否同意服务条款">同意服务条款？</a></p>
      <div class="blank5"></div>
		            <div class="registerBut"> 
			            <a href="info_application1.jsp"><input type="submit" value="注册" class="inbuttn2" ></input></a>
					</div>
    <p><strong>* 在提交您的注册信息时, 我们认为您已经同意了我们的服务条款.</strong></p>
    </fieldset>
  </form>
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

