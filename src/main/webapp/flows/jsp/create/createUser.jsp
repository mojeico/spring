<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
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



<h1>CREATE USER </h1>




<%--@elvariable id="user" type="model.User"--%>
<form:form method="post" modelAttribute="user">

    <form:input  path="login" type='text'  placeholder='Login'  />
    <form:input path="password" type='text'   placeholder='Password' />

    <input type="submit" name="_eventId_createUser">

</form:form>

</body>
</html>
