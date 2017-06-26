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
<body>
    <div>我的博客</div>
<div>
    <a href="jsp/login.jsp">跳到登录页</a>
    <a href="jsp/admin.jsp">跳到管理员页</a>
    <a href="jsp/showUser.jsp">跳到showUser页</a>
    <a href="jsp/welcome.jsp">跳到欢迎页</a>
    <a href="regist.jsp">跳到注册页</a>
</div>

    <%--<form action="use/login" method="post" class="div" >
     用户名：   <input type="text" id="username" name="username" value="admin"> <br>
      密码：  <input type="password" id="password" name="password" value="1"> <br>
        <input type="submit" value="提交"  onclick="r();"/>
    </form>--%>
<form action="use/login" method="post" class="div" >
    用户名：   <input type="text" id="username" name="username" value="admin"> <br>
    密码：  <input type="password" id="password" name="password" value="1"> <br>
    <input type="submit" value="提交"  onclick="r();"/>
</form>

   <%-- <form action="use/login" method="post" id="myform">
    <div id="content" style="margin:0 auto; background-color:#0F6; width:1000px; height:500px; position:relative;">


        <div class="use/login" style="position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px;">
            <div style=" margin-left:100px;margin-top:50px">
                <p style="display:inline">用户名:</p>
                <input type="text" value="admin"/>
            </div>
            <div style="margin-left:100px;margin-top:20px">
                <p style="display:inline">密&nbsp;码:</p>
                <input type="password" value="1"/>
            </div
            >
            <div style=" text-align:center;margin-top:20px">
                <input class="button" type="button" value="登录" style="margin-right:10px; padding:5px 15px; background:#F9C; border-radius:3px; border:#F0C 1px solid;"/>
                <input class="button" type="button" value="重置" style="padding:5px 15px; background:#F9C; border-radius:3px; border:#F0C 1px solid;"/>
            </div>
        </div>
    </div>
</form>--%>


</body>
</html>
