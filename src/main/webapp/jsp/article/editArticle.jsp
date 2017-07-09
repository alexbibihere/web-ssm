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
    <form action="${pageContext.request.contextPath}/article/update" method="post" class="div" >
        <input type="hidden" name="id" value="${article.id}">
        标题：   <input type="text"  name="title" value="${article.title}"> <br>
        作者：  <input type="text"  name="author" value="${article.author}"> <br>
        内容：  <textarea   name="content" value="${article.content}"></textarea> <br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
