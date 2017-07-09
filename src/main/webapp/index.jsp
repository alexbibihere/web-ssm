<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/21/0021
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的首页</title>
</head>
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
</script>
<style>
    body {
        text-align: center;
    }

    .div {
        position: absolute;
        margin: auto;
        top: 50%;
        left: 50%;
      /*  margin-top: -100px;
        margin-left: -200px;*/
        background: #69F;
        width: 400px;
        height: 200px;
        border-radius: 10px;
        align: center
    }

    .top-right{
        width:400px;
        height: 100px;
        float: right;
    }
    .top-left{
        font-size: 14px;
        text-align: right;
        width:1100px;
        margin-right: 100px;
        height: 100px;
        float: left;
    }
    .form-signin {
        max-width: 330px;
        padding: 15px;
        margin: 0 auto;
        background: #FFF;
        -moz-box-shadow: 0px 1px 5px rgba(0,0,0,.1);
        -webkit-box-shadow: 0px 1px 5px rgba(0,0,0,.1);
        box-shadow: 0px 1px 5px rgba(0,0,0,.1);
    }
    .form-signin .form-signin-heading, .form-signin .checkbox {
        margin-bottom: 10px;
    }
    .form-signin .checkbox {
        font-weight: normal;
    }
    .form-signin .form-control {
        position: relative;
        height: auto;
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
        padding: 10px;
        font-size: 16px;
    }
    .form-signin .form-control:focus {
        z-index: 2;
    }
    /* css注释：为了观察效果设置宽度 边框 高度等样式 */
</style>
<body>
<div class="top-left"><h1>欢迎来到我的博客</h1><br></div>
<div class="top-right">

    <a href="jsp/welcome.jsp">跳到欢迎页</a>
    <a href="user/getAllUser">查看用户列表</a>
    <a href="admin/getAllAdmin">查看管理员列表</a>
    <a href="login.jsp">登录</a>
    <a href="jsp/upload.jsp">upload</a>
    <a href="regist.jsp">跳到注册页</a>
    <a href="article/getAllArticle">查看我的文章</a>

</div>
<form action="${pageContext.request.contextPath}/user/login" method="post" class="form-signin">
    用户名： <input type="text" id="username"  name="username" value="admin"> <br>
    密码： <input type="password" id="password" name="password" value="1"> <br>
    <input type="submit" value="提交"  onclick="r();"/>
</form>


</body>
</html>
