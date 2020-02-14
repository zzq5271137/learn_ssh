<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/12
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn SSH 整合</title>
</head>
<body>
<h1>Learn SSH 整合</h1>

<form action="${pageContext.request.contextPath}/account_save.action">
    name: <input type="text" name="name"><br>
    money: <input type="text" name="money"><br>
    <input type="submit">
</form>

</body>
</html>
