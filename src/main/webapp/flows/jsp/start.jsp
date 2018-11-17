<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: glebmojeico
  Date: 09/11/2018
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<b1>FLOW</b1>
<b1>FLOW</b1>
<b1>FLOW</b1>

<%--
<form:form  method="POST"   modelAttribute="user" >

    <label>Имя</label>
    <form:input type='text'  placeholder='Имя'   path="firstname"/>
    <br>
    <label>Фамилия</label>
    <form:input type='text'  placeholder='Фамилия'  path="lastname"/>
    <br>


    <input type="submit" name="_eventId_create" value="Create User" />
    <input type="submit" name="_eventId_login" value="Login in" />
</form:form>--%>



<a href="${flowExecutionUrl}&_eventId=create">
    <button>CREATE USER</button>
</a>


<a href="${flowExecutionUrl}&_eventId=login">
    <button>LOGIN IN</button>
</a>

</body>
</html>
