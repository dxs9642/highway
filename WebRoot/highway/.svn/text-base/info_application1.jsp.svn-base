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
		<div class="area_r s_y_m">
			<div class="s_y"><span class="home"></span>您现在的位置：<a href="index.jsp">网站首页</a><span>></span>用户注册<span>></span>储值卡申请</div>
			<div class="main" >
            <div class="blank8"></div>
            <div id="image">
                            <input type=file name="doc" id="doc" onchange="javascript:setImagePreview();">  
<p>  
<div id="localImag"><img id="preview" width=-1 height=-1 padding-left:400px style="diplay:none"/></div>  
</p>  
<script>  
function setImagePreview() {  
        var docObj=document.getElementById("doc");  
   
        var imgObjPreview=document.getElementById("preview");  
                if(docObj.files &&    docObj.files[0]){  
                        imgObjPreview.style.display = 'block';  
                        imgObjPreview.style.width = '200px';  
                        imgObjPreview.style.height = '250px';                        
      imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);  
  
                }else{    
                        docObj.select();  
                        var imgSrc = document.selection.createRange().text;  
                        var localImagId = document.getElementById("localImag");    
                        localImagId.style.width = "200px";  
                        localImagId.style.height = "250px";   
try{  
                                localImagId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";  
                                localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;  
                        }catch(e){  
                                alert("您上传的图片格式不正确，请重新选择!");  
                                return false;  
                        }  
                        imgObjPreview.style.display = 'none';  
                        document.selection.empty();  
                }  
                return true;  
        }  
</script>  
</div>
            <div class="registerBut"> 
            <a href="info_application2.jsp"><input type="reset" value="确认" class="inbuttn2"></input></a>
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
