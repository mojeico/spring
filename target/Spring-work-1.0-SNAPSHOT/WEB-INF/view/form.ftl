
<html>
<head>
    <title>Title</title>
</head>
<body>

<b>Form</b>


<form action="/form"  method='post' enctype="multipart/form-data" >
    <fieldset>
        <label>Имя</label>
        <input type='text' name='firstname' placeholder='Имя' required><span></span>
        <br>
        <label>Фамилия</label>
        <input type='text' name='lastname' placeholder='Фамилия' required><span></span>
        <br>
        <label>Город</label>
        <input type='text' name='city' placeholder='Город' required><span></span>
        <br>
    </fieldset>
    <fieldset>
        <label>Эл. почта</label>
        <input type='email' name='email' placeholder='Эл. почта' required><span></span>
        <br>
        <label>Пароль</label>
        <input type='password' name='password' placeholder='Пароль' required><span></span>
        <br>
        <label>Повторите</label>
        <input type='password' name='repeat' placeholder='Повторите' required><span></span>
        <br>
    </fieldset>
    <fieldset>
        <p>Введите число с картинки</p>
        <img src="https://c22blog.files.wordpress.com/2010/10/input-black.gif">
        <input type='text' name='capcha' placeholder='число' required><span></span>
    </fieldset>


    File to upload: <input type="file" name="file"><br />
    Press here to upload the file!

    <br>
    <br>

<#--

    <tr>
        <th><label for="image">Profile image:</label></th>
        <td><input name="image" type="file"/>
    </tr>
-->


    <br>
    <br>

    <input type="submit">




</body>
</html>
