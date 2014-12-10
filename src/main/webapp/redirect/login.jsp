<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  User: ubuntu
  Date: 14-10-6
  Time: 下午3:40  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <s:form action="action1" namespace="/">
        <s:textfield name="username" label="username"/>
        <s:password name="password" label="password"/>
        <s:submit/>
    </s:form>
</body>
</html>
