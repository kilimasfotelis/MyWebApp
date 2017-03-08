<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2017-03-08
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/submitForm" method="POST">
<table>
    <tr>
        <td>Name:</td>
        <td><input type="text" name = "userName"></td>
    </tr>
    <tr>
        <td>Surname:</td>
        <td><input type="text" name = "userSurname"></td>
    </tr>
</table>
    <button>PRESS</button>
</form>
</body>
</html>
