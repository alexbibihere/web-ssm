<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/25/0025
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <script>
        function r()
        {
            var username=document.getElementById("username");
            var pass=document.getElementById("password");
            if(username.value=="")
            {
                alert("请输入用户名");
                username.focus();
                return;
            }
            if(pass.value=="")
            {
                alert("请输入密码");
                return;
            }
            return true;
        }
    </script>
    <style>
        body{ text-align:center}
        .div{position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px; align:center}
        /* css注释：为了观察效果设置宽度 边框 高度等样式 */
    </style>
</head>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}use/register" method="post" class="div" >
    用户名：   <input type="text" id="username" name="username" value="admin"> <br>
    密码：  <input type="password" id="password" name="password" value="1"> <br>
    <input type="submit" value="提交"  onclick="r();"/>
</form>
</body>
</html>
