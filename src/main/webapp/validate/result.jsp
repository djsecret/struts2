<%--  
  User: ubuntu
  Date: 14-10-5
  Time: 下午6:17  
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
    <title>Validate Result</title>
</head>
<body>
    <s:property value="username"/><br>
    <s:property value="password"/><br>
    <s:property value="repassword"/><br>
    <s:property value="birthday"/>
</body>
</html>
