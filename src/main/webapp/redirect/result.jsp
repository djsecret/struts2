<%--  
  User: ubuntu
  Date: 14-10-6
  Time: 下午3:56  
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
    <title></title>
</head>
<body>
    <s:property value="username"/><br>
    <s:property value="password"/><br>
    <s:property value="strAdd"/>
</body>
</html>
