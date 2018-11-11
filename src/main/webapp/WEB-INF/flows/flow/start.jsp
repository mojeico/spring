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


<%--@elvariable id="user" type="model.User"--%>
<form:form  method="POST"   modelAttribute="user" >

    <label>Имя</label>
    <form:input type='text'  placeholder='Имя'   path="firstname"/>
    <br>
    <label>Фамилия</label>
    <form:input type='text'  placeholder='Фамилия'  path="lastname"/>
    <br>


    <input type="submit" name="_eventId_activate" value="activate" />
    <input type="submit" name="_eventId_cancel" value="cancel" />
</form:form>





</body>
</html>
