<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/22/0022
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
<h1>你刚刚删除的用户信息是</h1>
<tr>
    <td>${user.id}</td>
    <td>${user.username}</td>
    <td>${user.password}</td>
</tr>

<a href="${pageContext.request.contextPath}/user/getAllUser">返回用户列表</a>
</body>
</html>
