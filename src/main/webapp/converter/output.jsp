<%--  
  User: ubuntu
  Date: 14-10-5
  Time: 上午9:56  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>结果页面</title>
</head>
<body>
    <s:property value="user"/>
</body>
</html>
