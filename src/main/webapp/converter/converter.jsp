<%--  
  User: ubuntu
  Date: 14-10-5
  Time: 上午9:54  
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
    <form action="userAction.action">
        userInfo:<input type="text" name="user"><br>
        <input type="submit">
    </form>


</body>
</html>
