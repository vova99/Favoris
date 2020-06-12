
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Login</title>
    <%@ include file="resource/bootstrapInclude.jsp"%>
</head>
<body>
    <div class="container">
        <form action="login" method="post">
            <div class="form-group">
                <label for="examplePhoneNumber">Phone number</label>
                <input type="text" class="form-control" id="examplePhoneNumber" name="username">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="password">
            </div>
            <button type="submit" class="btn btn-primary" value="submit">Submit</button>
            <a href="/registration" class="btn btn-primary">Registration</a>
        </form>
    </div>
</body>
</html>
