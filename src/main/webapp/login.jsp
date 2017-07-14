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
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>我的博客</title>
    <link rel="stylesheet" type="text/css" href="html/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="html/css/style.css">
    <link rel="stylesheet" type="text/css" href="html/css/login.css">
    <link rel="apple-touch-icon-precomposed" href="html/images/icon.png">
    <link rel="shortcut icon" href="html/images/favicon.ico">
    <script src="html/js/jquery-2.1.4.min.js"></script>

<%--    <!--[if gte IE 9]>
    <script src="html/js/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="html/js/html5shiv.min.js" type="text/javascript"></script>
    <script src="html/js/respond.min.js" type="text/javascript"></script>
    <script src="html/js/selectivizr-min.js" type="text/javascript"></script>
    <![endif]-->--%>
    <!--[if lt IE 9]>
    <script>window.location.href='upgrade-browser.html';</script>
    <![endif]-->
</head>

<body class="user-select">
<div class="container">
    <div class="siteIcon"><img src="html/images/icon.png" alt="" data-toggle="tooltip" data-placement="top" title="欢迎使用我的博客" draggable="false" /></div>
    <form action="admin/login" method="post" autocomplete="off" class="form-signin">
        <h2 class="form-signin-heading">管理员登录</h2>
        <label for="userName" class="sr-only">用户名</label>
        <input type="text" id="userName" name="username" class="form-control" placeholder="请输入用户名" required autofocus autocomplete="off" maxlength="10">
        <label for="userPwd" class="sr-only">密码</label>
        <input type="password" id="userPwd" name="password" class="form-control" placeholder="请输入密码" required autocomplete="off" maxlength="18">
        <a href="main.html"><button class="btn btn-lg btn-primary btn-block" type="submit" id="signinSubmit">登录</button></a>
    </form>
    <div class="footer">
        <p><a href="html/index.jsp" data-toggle="tooltip" data-placement="left" title="不知道自己在哪?">回到后台 →</a></p>
    </div>
</div>
<script src="html/js/bootstrap.min.js"></script>
<script>
    $('[data-toggle="tooltip"]').tooltip();
    window.oncontextmenu = function(){
        //return false;
    };
    $('.siteIcon img').click(function(){
        window.location.reload();
    });
    $('#signinSubmit').click(function(){
        if($('#userName').val() === ''){
            $(this).text('用户名不能为空');
        }else if($('#userPwd').val() === ''){
            $(this).text('密码不能为空');
        }else{
            $(this).text('请稍后...');
        }
    });
</script>

<%--
<div class="container" style="width:300px;border:blue;">

    <form class="form-signin" action="${pageContext.request.contextPath}/user/login" method="post">
        <h2 class="form-signin-heading">登录</h2>
        <label for="username" class="sr-only">Email address</label>
        <input type="text" id="username" class="form-control" placeholder="请输入用户名" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="请输入密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>

</div> <!-- /container -->

&lt;%&ndash;
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>&ndash;%&gt;
<script src="js/jquery-1.11.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>--%>
</body>
</html>
