<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/7/3/0003
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传与下载</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/user/upload" enctype="multipart/form-data">

    <input type="text" name="id">
    <input type="file" name="file">
    <input type="submit" value="提交">

</form>

</body>
</html>
