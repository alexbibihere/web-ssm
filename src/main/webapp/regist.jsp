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
        function r() {
            var username = document.getElementById("username");
            var pass = document.getElementById("password");
            if (username.value == "") {
                alert("请输入用户名");
                username.focus();
                return;
            }
            if (pass.value == "") {
                alert("请输入密码");
                return;
            }
            return true;
        }
        var xmlHttp;
        var flag;
        function createXMLHttp() {
            if (window.XMLHttpRequest) {
                xmlHttp = new XMLHttpRequest();
            } else {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
        function checkUsername(username) {
            createXMLHttp();
            xmlHttp.open("POST", "${pageContext.request.contextPath}/user/checkUsername?username=" + username);
            xmlHttp.onreadystatechange = checkUsernameCallback;
            xmlHttp.send(null);
            document.getElementsById("msg").innerHTML = "正在验证..";
        }
        function checkUsernameCallback() {
            if (xmlHttp.readyState == 4) {
                var text = xmlHttp.responseText;
                if (text == "true") {
                    flag = false;
                    document.getElementById("msg").innerHTML = "用户id重复，无法使用";
                } else {
                    flag = true;
                    document.getElementById("msg").innerHTML = "此用户可以注册!";
                }
            }
        }
        function checkForm() {
            return flag;
        }
    </script>
    <style>
        body {
            text-align: center
        }

        .div {
            position: absolute;
            top: 50%;
            left: 50%;
            margin-top: -100px;
            margin-left: -200px;
            background: #69F;
            width: 400px;
            height: 200px;
            border-radius: 10px;
            align: center
        }

        /* css注释：为了观察效果设置宽度 边框 高度等样式 */
    </style>
</head>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/user/register" method="post" class="div">
    用户名： <input type="text" name="username"  onblur="checkUsername(this.value)"><span id="msg"></span> <br>
    密码： <input type="password" name="password" > <br>
    <input type="submit" value="提交" onclick="r();"/>
</form>
</body>
</html>
