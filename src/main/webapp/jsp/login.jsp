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
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
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

<%--
    <form class="form-signin" action="${pageContext.request.contextPath}/admin/login" method="post" id="login_form">
--%>
        <h2 class="form-signin-heading">登录</h2>
        <label for="username" class="sr-only">Email address</label>
        <input type="text" id="username" class="form-control" placeholder="请输入管理员账号" required autofocus>
        <span id="user_alert" style="color:red;visibility:hidden">请输入账号</span>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="请输入密码" required>
        <span id="pwd_alert" style="color:red;visibility: hidden">请输入密码</span>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button id="submit" class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    <span id="login_error" style="color:red;visibility: hidden">用户密码不匹配，请重新输入</span>


</div>

<script type="text/javascript">
    $(function () {
        $("#submit").click(function () {
            var user = $("#username").val();
            var pwd = $("#inputPassword").val();
            var verify = true;
            if(user.length==0){
                $("#user_alert").css("visibility","visible");
                verify = false;
            }
            if(pwd.length==0){
                $("#pwd_alert").css("visibility","visible");
                verify = false;
            }
            if(verify){
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/admin/login",
                    data:{"username":user,"password":pwd},
                    success: function (data) {
                       if(data =="login_success"){
                            window.location.href="${pageContext.request.contextPath}/jsp/admin/admin.jsp";
                       }else {
                           $("#login_error").css("visibility","visible");
                       }
                    }
                })
            }
        });
    })
</script>
</body>
</html>
