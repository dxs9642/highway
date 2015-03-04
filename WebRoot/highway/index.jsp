<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.highway.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>高速公路收费系统</title>
<link type="text/css" href="/highway/highway/style.css" rel="stylesheet" />
<script type="text/javascript" language="javascript" src="/highway/highway/js/scrollver.js"></script>
<script type="text/javascript" language="javascript">
<!--
function init_Scroll(){
     var scrollPics = new scrollVertical('container','message','ul');
         scrollPics.speed = 2000;
         scrollPics.isPause = true;
 
     var timer_start = setTimeout(function(){clearTimeout(timer_start);scrollPics.isPause = false;},1000);

     Event.addEvent(scrollPics.scrollArea,"mouseover",function(){scrollPics.isPause = true;});
     Event.addEvent(scrollPics.scrollArea,"mouseout",function(){scrollPics.isPause = false;});
}
Event.addEvent(window,'load',init_Scroll);
//-->
</script>
</head>

<body>
<!--top part start-->
	<div id="top" class="clearfix">
		<div class="logo"><a href="/highway/highway/index.jsp"></a></div>
		<div class="s_c">
<span style="float: right; color: red;">
<% User user = (User)session.getAttribute("user");%>
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
	<div class="banner clearfix">
			<script language="javascript">
					var objectContent = '<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabsimg/swflash.cab#version=7,0,19,0" width="894" height="324">'
						+'<param name="movie" value="flash/banner.swf">'
						+'<param name="wmode" value="transparent">'
						+'<param name="quality" value="high">'
						+'<embed src="flash/banner.swf" wmode="transparent" quality="high"  width="894" height="324" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" />'
					+'</object>';
					document.write(objectContent);
			</script>
	</div>	
<!--content part start-->
	<div class="block clearfix">
<div class="area_ll"><div id="h2-1"><span class="xc">宣传短片/propagate</span></div></div>
		<div class="area_rr">
			<div class="company">
				<img src="/highway/highway/images/service.jpg" width="608" height="47" />
                <div class="blank5"></div>
				<p>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;高速公路电子收费客服系统是围绕高速公路所使用的储值卡而展开的客服系统，储值卡是一种特殊的卡片，除了卡号外，卡内部还存储了车辆的信息。客服系统主要功能包括卡片办理、卡片充值、消费记录查询、充值记录查询等，这套系统的使用者主要是客服营业厅的工作人员，这就需要储值卡持有者或需要申请储值卡的人前往客服营业厅办理相关业务。

				</p>
                <div class="blank8"></div>
			</div>
			<div class="services">
				<img src="/highway/highway/images/company.jpg" width="608" height="47" />
                
  <div id="container">
					<div id="message">
						<ul>
							<li>
								<a href=""><img src="/highway/highway/images/p1.jpg" title="" alt="" /><br />业务办理</a></li>
							<li>
								<a href=""><img src="/highway/highway/images/p2.jpg" title="" alt="" /><br />客服中心</a></li>
							<li>
								<a href=""><img src="/highway/highway/images/p3.jpg" title="" alt="" /><br />展望未来</a></li>
						</ul>
						<ul>
							<li>
								<a href=""><img src="/highway/highway/images/p4.jpg" title="" alt="" /><br />网营业厅</a></li>
							<li>
							<a href=""><img src="/highway/highway/images/p5.jpg" title="" alt="" /><br />热情服务</a>
							</li>
							<li>
							<a href=""><img src="/highway/highway/images/p6.jpg" title="" alt="" /><br />联系方式</a>
							</li>
						</ul>
					</div>	
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
