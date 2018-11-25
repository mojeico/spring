

<html>
<head>


    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>


</head>

<body>




<form method="POST" action="/login" class="box login">





        <label> Username </label>
        <input type='text' name="login" placeholder="Login">


        <label> Password </label>
        <input type='password' name="password" placeholder="Password"/>
        <br>

        <p><input type="checkbox" name="remember"  /> Remember me</p>




    <footer>

        <input type="submit" class="btnLogin" value="Submit">

        <c:if test="${not empty error}">
            <span class="error">${error}</span>
        </c:if>


    </footer>


</form>




</body>
</html>
