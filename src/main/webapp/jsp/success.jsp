<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/25/0025
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%
    //页面每隔30秒自动链接至另一页面
    response.setHeader("refresh","3;URL=/ssm/jsp/showUser.jsp");
%>--%>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
        <h1>恭喜你注册成功</h1> <a href="${pageContext.request.contextPath}/use/select">查看已注册的用户列表</a>
</body>
</html>
