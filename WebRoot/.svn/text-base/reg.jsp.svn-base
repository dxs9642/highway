<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<SCRIPT language=javascript>
	function checkPasswd(){
		var newpwd=document.getElementById("password").value;
		var confirmpwd=document.getElementById("passwordAgain").value;
		if(confirmpwd!=""){
			document.getElementById("passwdIn2").style.display="none";
		}else{
			document.getElementById("passwdIn2").style.display="inline";
		}
		
		if(newpwd!="")
		{
			document.getElementById("passwdIn").style.display="none";
			if(newpwd!=confirmpwd)
			{
				document.getElementById("secondpwd").style.display="inline";
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
		}else{
			document.getElementById("userIn").style.display="inline";
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
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
		<title>用户注册</title>
	</head>
	<body background="/highway/Images/bg.jpg">
		<a href="index.jsp">返回</a>
		
		<h1 align="center">
			请填写您的个人信息
		</h1>

		<form action="/highway/user/register" method="post" onsubmit="return checkSubmit()">
			<table id="advSearch" border="0" align="center">


				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="user.userName" id="username" onblur="checkUser()"></input>
						<span style="color:red;display:none;" id="userIn" >*用户名不能为空！</span>
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						<input type="password" name="user.userPassword" id="password" onblur="checkPasswd()"></input>
						<span style="color:red;display:none;" id="passwdIn">*密码不能为空！</span>
					</td>
				</tr>
				<tr>
					<td>
						确认密码：
					</td>
					<td>
						<input type="password" id="passwordAgain" name="passwordAgain" onblur="checkPasswd()"></input>
						<span style="color:red;display:none;" id="secondpwd">*两次密码不一致！</span>
						<span style="color:red;display:none;" id="passwdIn2">*密码不能为空！</span>
					</td>
					<td></td>
				</tr>

				<tr>
					<td>
						Email：
					</td>
					<td>
						<input type="text" name="user.email" id="email" onblur="checkMail('email')"></input>
						<span style="color:red;display:none;" id="emailIn">*邮箱格式错误！</span>
					</td>
				</tr>
				<tr>
					<td>
						送货地址：
					</td>
					<td>
					<input type="text" name="user.address"></input></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="提交">
						<input type="reset" value="清空">
					</td>
				</tr>
			</table>
		</form>
		<br></br>

		<div align="right">
		</div>
		<s:fielderror />

	</body>
</html>