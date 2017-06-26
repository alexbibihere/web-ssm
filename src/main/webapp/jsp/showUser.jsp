<%--
  Created by IntelliJ IDEA.
  User: Zhangxq
  Date: 2016/7/16
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
    <c:if test="${!empty tblUserList}">
        <c:forEach var="user" items="${tblUserList}">
            用户名：${user.userName} &nbsp;&nbsp;<br>
            密码：${user.userPwd} &nbsp;&nbsp;<br>
        </c:forEach>
    </c:if>

<h1>12</h1>
</body>
</html>
