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
<%--<form action="/user/login" method="post">
    <table width="350" bgcolor="#ccffcc"  border="1">
        <tr align=center>
            <td>用户名</td><td><input type="text" name="username" id="username"></td>
        </tr>
        <tr align=center><td>密 码</td><td><input type="password" name="password" id="password"></td></tr>
        <tr align=center><td>验证码</td><td><input type="text" name="check"></td></tr>
        <tr align=center><td colspan="2"><input type="button" value="登 录" onclick="r();"/>     <input type="reset" value="重 置"/></td></tr>
    </table>
</form>--%>
<form action="showUser.jsp" method="post">
<div id="content" style="margin:0 auto; background-color:#0F6; width:1000px; height:500px; position:relative;">


    <div class="login" style="position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px;">
        <div style=" margin-left:100px;margin-top:50px">
            <p style="display:inline">用户名:</p>
            <input type="text" value="123"/>
        </div>
        <div style="margin-left:100px;margin-top:20px">
            <p style="display:inline">密&nbsp;码:</p>
            <input type="password" value="123"/>
        </div>
        <div style=" text-align:center;margin-top:20px">
            <input class="button" type="button" value="登录" style="margin-right:10px; padding:5px 15px; background:#F9C; border-radius:3px; border:#F0C 1px solid;"/>
            <input class="button" type="button" value="重置" style="padding:5px 15px; background:#F9C; border-radius:3px; border:#F0C 1px solid;"/>
        </div>
    </div>
</div>
</form>
</body>
</html>
