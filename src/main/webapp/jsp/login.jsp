<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/27/0027
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员后台</title>
</head>
<style>
    body{ text-align:center}
    .div{position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px; align:center}
    /* css注释：为了观察效果设置宽度 边框 高度等样式 */
</style>
<body>
    <h1>管理员后台登录</h1>
<form action="${pageContext.request.contextPath}/admin/login" method="post"  class="div" >
    用户名：   <input type="text" id="username" name="username" placeholder="请输入管理员账号" value="admin"> <br>
    密码：  <input type="password" id="password" name="password" placeholder="请输入密码" value="1"> <br>
    <input type="submit" value="提交"  />
</form>
</body>
</html>
