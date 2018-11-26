<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <a href="userinfo/toAddUserPage.do">添加用户</a>
    <form action="userinfo/findAllUserCondition.do" method="post">
    	从<input type="text" name="startTime">到<input type="text" name="endTime">
    	<button type="submit">查询</button>
    </form>
    <table border="1px">
        
    	<tr>
    		<td>编号</td>
    		<td>用户名</td>
    		<td>密码</td>
    		<td>创建时间</td>
    	</tr>
    	<c:forEach items="${userList}" var="userinfo">
    		<tr>
	    		<td>${userinfo.id}</td>
	    		<td>${userinfo.username}</td>
	    		<td>${userinfo.password}</td>
	    		<td><f:formatDate value="${userinfo.createtime}" pattern="yyyy-MM-dd hh:mm:SS"/></td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
