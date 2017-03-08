<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2017-03-08
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty name}"></c:if>
<div>Hello ${name}</div>
<c:if test="${not empty person}">
    <h3>${person.name}</h3> <h1>${person.surname}</h1>
</c:if>
</body>
</html>
