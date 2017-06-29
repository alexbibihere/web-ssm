<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/29/0029
  Time: 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑页面</title>
    <style>
        body{
            text-align:center;
        }
    </style>
</head>
<body>
<h1>更新管理员信息</h1>
<form action="${pageContext.request.contextPath}/admin/update" method="post" class="div" >
    <input type="hidden" name="id" value="${user.id}">
    用户名：   <input type="text"  name="username" value="${user.username}"> <br>
    密码：  <input type="text"  name="password" value="${user.password}"> <br>
    <input type="submit" value="提交" />
</form>
</body>
</html>
