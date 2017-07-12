<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2017/6/20/0020
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>管理员列表</title>
    <base href="<%=basePath%>">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">

        function del(id){
            $.get("<%=basePath%>admin/delete?id=" + id,function(data){
                /*if("success" == data.result){
                    alert("删除成功");
                    window.location.reload();
                }else{
                    alert("删除失败");
                }*/alert("helo");
            });
        }
      /*  //删除方法
        function del() {
           alert($(this).parents("tr").find("td:eq(1)").text());
        }
        var dele = function(){
            var adminId = $("#qw").attr("data-id");
            $.ajax({
                url : BASE+"/admin/delete",
                data : {'adminId':adminId},
                type : 'POST',
                dataType : 'json',
                success : function(data) {
                    if(data.success){
                        showInfo("删除成功", function() { }, 3);
                        window.location.reload();
                    }else{
                        showInfo("服务器正忙，请稍后再试", function() { }, 3);
                    }
                }
            })
        }
        $("#delete").click(dele);

        //单个删除
        $(document).on("click",".btn",function () {
            //alert($(this).parents("tr").find("td:eq(1)").text());
            alert("erwe");
        });*/
    </script>

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
<h1>欢迎来到管理员后台</h1>          <a href="${pageContext.request.contextPath}/index.jsp" class="c1">回到首页</a>
<table border="1" class="table table-bordered">
    <tbody>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>密码</th>
        <th>年龄</th>
    </tr>

    <c:if test="${!empty adminList }">
        <c:forEach items="${adminList}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.password}</td>
                <td id="qw">
                    <%--<a href="${pageContext.request.contextPath}user/update?id=${u.id}">编辑</a>
                    <a href="javascript:del('${u.id }')">删除</a>--%>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/getAdmin?id=${u.id}">修改</a>
                        <%--<a href="javascript:del('${u.id }')">删除</a>--%>
                    <a class="btn btn-danger" href="${pageContext.request.contextPath}/admin/delete?id=${u.id}"> 删除</a>
            <%--<button onclick="del()" class="btn">删除</button>--%>
                 <%--   <a href="${pageContext.request.contextPath/user?method=delete?id=${u.id}}" onclick="del">删除</a>--%>
                </td>
            </tr>
        </c:forEach>
    </c:if>


    </tbody>
</table>



</body>
</html>
