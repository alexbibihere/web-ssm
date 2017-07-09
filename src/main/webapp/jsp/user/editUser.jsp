<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/29/0029
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            text-align:center;
        }
    </style>
</head>
<body>
<head>
    <h1>更新用户信息</h1>
    <form action="${pageContext.request.contextPath}/user/update" method="post" class="div" >
        <input type="hidden" name="id" value="${tblUser.id}">
        用户名：   <input type="text"  name="username" value="${tblUser.username}"> <br>
        密码：  <input type="text"  name="password" value="${tblUser.password}"> <br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
