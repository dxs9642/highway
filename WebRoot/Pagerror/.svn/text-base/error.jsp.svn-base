<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Welcome" content="text/html;charset=GBK"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>页面错误</title>
<link rel="stylesheet" type="text/css" href="/highway/files/main.css">
<script>
function changetoen(){
	$(".zh").hide();
}
function changetozh(){
	$(".zh").show();
	document.getElementById("main").style.display='none';
}
</script>
</head>
<body>
  <div id="main">
    <header id="header">
      <h1><span class="icon">!</span>页面错误<span class="sub">内部错误</span></h1>
    </header>
    <div id="content">
      <h2>内部错误</h2>
      <p>不好意思，系统内部出现了一些错误，我们会尽量快速修理的</p>
      <div class="utilities">
        <a class="button right" href="#" onClick="history.go(-1);return true;">Go Back...</a><a class="button right" href="#">Contact Us</a>
        <div class="clear"></div>
      </div>
    </div>
    <div id="footer">
          <ul>
            <li><a href="#">主页</a></li>
            <li><a href="#">关于</a></li>
            <li><a href="#">项目</a></li>

          </ul>
        </div>
  </div>
  	<h3>下面是错误的输出位置，大家用chrome或者firefox的审查元素来查看详细信息，或者使用ie的查看源代码，在实际发布的时候这个部分删除</h3>
	<p>错误原因：</p>
	<span><s:property value="exception" /></span>
	<p>错误参数：</p>
	<s:property value="exceptionStack" />
</div>
</html>