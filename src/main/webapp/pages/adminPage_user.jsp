<%--
  Created by IntelliJ IDEA.
  User: uer
  Date: 18.06.20
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<div class="container">
    <table  class="table" >
        <thead>
        <tr>
            <th scope="col">Email</th>
            <th scope="col">Ім'я</th>
            <th scope="col">Прізвище</th>
            <th scope="col">Номер ферми</th>
            <th scope="col">Телефон</th>
            <th scope="col">Адреса</th>
            <th scope="col"></th>
            <th scope="col"></th>
            <th scope="col"></th>

        </tr>
        </thead>
        <tbody  id="showUsers">
        <c:forEach items="${users}" var="user">
            <form action="/updateUser-${user.id}" method="post">
                <tr>
                    <td>
                        <input class="form-control" value="${user.username}" name="username">
                    </td>
                    <td><input class="form-control" value="${user.firstName}"  name="firstname"></td>
                    <td><input class="form-control" value="${user.secondName}" name="secondname"></td>
                    <td><input class="form-control" value="${user.name_of_farm}" name="name_of_farm"></td>
                    <td><input class="form-control" value="${user.phoneNumber}" name="phoneNumber"></td>
                    <td><input class="form-control" value="${user.adress}" name="adress"></td>
                    <td><button type="submit" class="btn btn-primary">Оновити</button></td>
                    <td><a href="deleteUser-${user.id}" class="btn btn-danger">Видалити</a></td>
                </tr>
            </form>
        </c:forEach>


        </tbody>
    </table>
    <form action="/addUser" method="post">
        <input type="text" placeholder="Email" class="form-control" name="username">
        <input type="text" placeholder="Ім'я" class="form-control" name="firstname">
        <input type="text" placeholder="Прізвище" class="form-control" name="secondname">
        <input type="text" placeholder="Номер телефону" class="form-control" name="phoneNumber">
        <input type="text" placeholder="Адреса" class="form-control" name="adress">
        <input type="text" placeholder="Password" class="form-control" name="password">
        <br>
        <button type="submit" class="btn btn-block btn-primary">Зареєструвати</button>
    </form>
</div>
</body>
</html>
