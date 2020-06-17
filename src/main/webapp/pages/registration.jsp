<%--
  Created by IntelliJ IDEA.
  User: uer
  Date: 08.06.20
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Login</title>
    <%@ include file="resource/bootstrapInclude.jsp"%>
</head>
<body>
    ${message}
    <div class="container">
        <form action="/registration" method="post">
            <div class="form-group">
                <label for="phoneNumber">Phone number</label>
                <input type="text" class="form-control" id="phoneNumber" name="username">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" name="firstName">
            </div>
            <div class="form-group">
                <label for="secondName">Second name</label>
                <input type="text" class="form-control" id="secondName" name="secondName">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <a href="/login" class="btn btn-primary">Login</a>
        </form>
    </div>
</body>
</html>
