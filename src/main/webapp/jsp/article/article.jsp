<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/22/0022
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>我的文章</title>
</head>
<body>
        <h1> 欢迎来到我的文章</h1>
        <tr>
            <th>标题</th>
            <th>作者</th>
            <th>内容</th>
            <th>发布日期</th>
        </tr>

                <tr>
                    标题：${article.title} &nbsp;&nbsp;<br>
                    作者：${article.author} &nbsp;&nbsp;<br>
                    内容：${article.content} &nbsp;&nbsp;<br>
                    发布日期：${article.createTime} &nbsp;&nbsp;<br>
                    <a href="${pageContext.request.contextPath}/article/getArticle?id=${artice.id}">编辑</a>
                </tr>

</body>
</html>
