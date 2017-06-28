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
    <script type="text/javascript" src="../jquery-1.7.1.js"></script>
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
    <style>
        body{ text-align:center}
        .div{position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px; align:center}
        .c{
            margin-top:-100px;
            margin-left:-200px;
            position:absolute;
            top:50%;left:50%;
            align:center;
            width:400px; height: 200px; border-radius:10px;
        }
        /* css注释：为了观察效果设置宽度 边框 高度等样式 */
    </style>
</head>
<body>
<h1>欢迎来到管理员后台</h1>
<table border="1" class="c">
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
                <td>${u.age}</td>
                <td id="qw">
                    <%--<a href="${pageContext.request.contextPath}user/update?id=${u.id}">编辑</a>
                    <a href="javascript:del('${u.id }')">删除</a>--%>
                    <a href="${pageContext.request.contextPath}/admin/getUser?id=${u.id}">编辑</a>
                        <%--<a href="javascript:del('${u.id }')">删除</a>--%>
                    <a href="${pageContext.request.contextPath}/admin/delete?id=${u.id}"> 删除</a>
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
