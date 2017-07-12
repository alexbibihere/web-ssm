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
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Yande</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">个人中心 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">文章</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">你听 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">
                    <span class="glyphicon glyphicon-search">搜索</span>
                </button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">设置</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">严德广 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container" style="width:300px;border:blue;">

    <form class="form-signup" action="${pageContext.request.contextPath}/user/register" method="post">
        <h2 class="form-signin-heading">注册</h2>
        <label for="username" class="sr-only">Email address</label>
        <input type="text" name="username" id="username" class="form-control" placeholder="请输入用户名" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="请输入密码" required>
        <label class="sr-only"> 性别</label>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="男"> 男
            </label>
            <label>
                <input type="checkbox" value="女"> 女
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
    </form>

</div>
<%--<form action="${pageContext.request.contextPath}/user/register" method="post" class="form-signin">
    用户名： <input type="text" name="username"  onblur="checkUsername(this.value)"><span id="msg"></span> <br>
    密码： <input type="password" name="password" > <br>
    再次输入密码： <input type="password" name="password" > <br>
    <input type="submit" value="注册" onclick="r();"/>
</form>--%>
</body>
</html>
