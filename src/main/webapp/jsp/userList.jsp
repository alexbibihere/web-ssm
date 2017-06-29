<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户信息列表</title>
    <style>
        body{ text-align:center}
        .div{position:absolute; top:20%;left:50%;margin-top:-10px;margin-left:-200px;background:#69F; width:400px; height: 200px; border-radius:10px; align:center}
        .c{
            margin-top:-100px;
            margin-left:-200px;
            position:absolute;
            top:20%;left:50%;
            align:center;
            width:400px; height: 200px; border-radius:10px;
        }
        /* css注释：为了观察效果设置宽度 边框 高度等样式 */
    </style>
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

    </script>
</head>
<body>
<table border="1" class="c">
    <tbody>
<tr>
    <th>id</th>
    <th>姓名</th>
    <th>密码</th>
</tr>

<c:if test="${!empty user}">
    <c:forEach var="u" items="${user}">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>
                <a href="${pageContext.request.contextPath}/user/getUser?id=${u.id}">修改</a>
                <%--<a href="javascript:del('${u.id }')">删除</a>--%>
                <a href="${pageContext.request.contextPath}/user/delete?id=${u.id}"> 删除</a>
            </td>
        </tr>
    </c:forEach>
</c:if>
    </tbody>
</table>
</body>
</html>
