<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: glebmojeico
  Date: 16/11/2018
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>LOGIN IN</h1>


<%--@elvariable id="user" type="entities.Users"--%>
<form:form method="post" modelAttribute="user">


    <form:input path="login" type="text" placeholder="Login"/>

    <form:input path="password" type="text" placeholder="Password"/>

    <input name="_eventId_login" type="submit" title="enter">


</form:form>

</body>
</html>
