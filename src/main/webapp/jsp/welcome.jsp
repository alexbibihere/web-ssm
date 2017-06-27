<%@ page contentType="text/html;charset=UTF-8" language="java" %><html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <title>欢迎页</title>

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
<form action="user/showUser" method="post">
    <table width="350" bgcolor="#ccffcc"  border="1" align="center">
        <tr align=center>
            <td>用户名</td><td><input type="text" name="username" id="username"></td>
        </tr>
        <tr align=center><td>密 码</td><td><input type="password" name="password" id="password"></td></tr>
       <%-- <tr align=center><td>验证码</td><td><input type="text" name="yanzheng"></td></tr>--%>
        <tr align=center><td colspan="2"><input type="submit" value="登 录" onclick="r();"/>     <input type="reset" value="重 置"/></td></tr>
    </table>
    <a href="login1.jsp">跳到登录页</a>
    <a href="admin.jsp">跳到管理员页</a>
    <a href="showUser.jsp">跳到showUser页</a>
    <a href="../index.jsp">跳到欢迎页</a>



</form>
</body>
</html>