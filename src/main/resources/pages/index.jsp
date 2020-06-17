<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Кабінет</title>
    <%@include file="resource/bootstrapInclude.jsp"%>
</head>
<body>
 <h1>Hellsdvsdlkmsksklmlk</h1>
 ${abc}
 <sec:authorize access="hasRole('ADMIN')">
     Manage Users
 </sec:authorize>
 <sec:authorize access="hasRole('USER')">
     Manage Usersdsvsdsfdsfd
 </sec:authorize>
</body>
</html>
