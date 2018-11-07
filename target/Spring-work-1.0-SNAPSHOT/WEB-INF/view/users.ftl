<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>hello ${username}</h1>
<ul>
    <#list users as user>
       <#-- <img src="${file}" typeof="image">-->
        <img src="/resources/frfr.jpg">
        <li>Firstname - ${user.firstname} <br>
            Lastname  - ${user.lastname} <br>
            City      - ${user.city} <br>
            E-mail    - ${user.email} <br>
            Image     - ${user.filename}
            <br><br>
        </li>

    </#list>
</ul>



<a href="/form">
    <button >Form</button>
</a>
<a href="/users/show">
    <button >Users</button>
</a>







</body>
</html>
