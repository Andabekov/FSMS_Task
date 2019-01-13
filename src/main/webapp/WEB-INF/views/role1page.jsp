<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%--
  Created by IntelliJ IDEA.
  User: Abu
  Date: 13.01.2019
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Role1Page</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
</head>
<body>

<form:form method="POST" modelAttribute="orders">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="status" id="status" value="1"/>
    <table>
        <tr>
            <td><label for="order_number">Номер заявки: </label> </td>
            <td><form:input path="order_number" id="order_number"/></td>
            <td><form:errors path="order_number" cssClass="error"/></td>
        </tr>
        <tr>
            <td><label for="author">Автор заявки: </label> </td>
            <td><form:input path="author" id="author" /></td>
            <td><form:errors path="author" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Register"/>
            </td>
        </tr>
    </table>
</form:form>


</body>
</html>
