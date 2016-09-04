<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(basePath);

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>通过ajax 调用 webservice</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.4.2.js"></script>
	
	<script type="text/javascript">
	
		$(function(){
			var data='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://web.cxf.mamager.rulengine.personal.com/">';
			data+='<soapenv:Header/><soapenv:Body><web:getPerson><arg0>11</arg0><arg1>刘保</arg1></web:getPerson></soapenv:Body></soapenv:Envelope>';
			$("#buttonajax").click(function(){
				$.ajax({
				   type: "POST",
				   url: "ws/departmentService",
				   data:data,
				   contentType:'text/xml;charset=utf-8',
				   success: function(data){
				  		 var textdata=$(data).find('return').text();
				  		 $("#divMessage").html(textdata);
				  		 $("#divMessage").slideDown(2000);
				  		 //show()  hide()
				  		 
				  		 //fadeIn  fadeOut
				  		 
				  		 //slideDown slideUp
				  		 
				   }
				});
			})
		})
	
	
	</script>
	
	
  </head>
  
  <body>
    	<input type="button" value="ajax 调用webservice" id="buttonajax">
    	<div style="display: none;border: 2px solid red;height: 300px; width: 300px;" id="divMessage"></div>
    	
  </body>
</html>
