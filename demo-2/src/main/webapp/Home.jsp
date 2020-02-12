<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>$(document).ready(function (x) {
        $('#submit').click(function (x) {
            var name = $("#name").val();
            var password = $("#password").val();
            var email = $("#email").val();
            var info = { "name": name, "password": password, "email": email };
            var Infor = JSON.stringify(info);
            $.ajax({
                url: 'login',
                type: 'post',
                data: Infor,
                dataType: 'json',
                contentType: 'application/json',
                cache: false,
            });
            return false;
        });
    }); </script>

<body>
    <form action="./login" method="post">
        <br>
        <h1 style="text-align: center;">Welcome</h1>
        <hr>
        <br> <br>
        <h3 style="text-align: center;">
            Name:<input type="text" name="name" id="name"><br> <br>
            Password:<input type="password" name="password" id="password">
            E-mail:<input type="text" email="email" id="email" />
        </h3>
        <h2 style="text-align: center;">
            <input type="submit" value="Sign in">
        </h2>
    </form>
</body>

</html>