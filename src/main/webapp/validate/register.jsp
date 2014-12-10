<%--  
  User: ubuntu
  Date: 14-10-5
  Time: 下午6:14  
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
    <title>Register</title>
</head>
<body>
    <s:actionerror/>


    <s:form action="register" namespace="/">
        <s:textfield name="username" label="username"/>
        <s:password name="password" label="password"/>
        <s:password name="repassword" label="repassword"/>
        <s:textfield name="birthday" label="birthday"/>
        <s:submit/>
    </s:form>

    <!--
    <form action="<%=basePath%>register.action">
        username:<input type="text" name="username"><br>
        password:<input type="password" name="password"><br>
        repassword:<input type="password" name="repassword"><br>
        birthday:<input type="text" name="birthday"><br>
        <input type="submit">
    </form>
-->
</body>
</html>
