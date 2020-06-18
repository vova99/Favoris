<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee   http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
</web-app>
<html>
<head>
    <title>Кабінет</title>

    <%@include file="resource/bootstrapInclude.jsp"%>
</head>
<body>
 <h1>Hellsdvsdlkmsksklmlk</h1>
<%--<c:out value="${abc}"/>--%>
 <sec:authorize access="hasRole('ADMIN')">
     Manage Users
 </sec:authorize>
 <sec:authorize access="hasRole('User')">
     Manage Usersdsvsdsfdsfd
 </sec:authorize>
</body>
</html>
