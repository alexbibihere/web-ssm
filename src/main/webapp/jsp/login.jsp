<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/20/0020
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
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
</head>
<body>
<form action="/user/login" method="post">
    <table width="350" bgcolor="#ccffcc"  border="1">
        <tr align=center>
            <td>用户名</td><td><input type="text" name="username" id="username"></td>
        </tr>
        <tr align=center><td>密 码</td><td><input type="password" name="password" id="password"></td></tr>
        <tr align=center><td>验证码</td><td><input type="text" name="check"></td></tr>
        <tr align=center><td colspan="2"><input type="button" value="登 录" onclick="r();"/>     <input type="reset" value="重 置"/></td></tr>
    </table>
</form>
</body>
</html>
