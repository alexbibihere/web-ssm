<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/20/0020
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>管理员列表</title>
</head>
<body>
<table border="1">
    <tbody>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    <c:if test="${!empty user }">
        <c:forEach items="${user}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.password}</td>
            </tr>
        </c:forEach>
    </c:if>

    <<%--tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
    </tr>--%>
    </tbody>
</table>


<h1>12</h1>
</body>
</html>
