<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Abu
  Date: 13.01.2019
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FSMS_Task</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
    <script>
        var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope) {
            $scope.roles = [
                {name : "Не выбрано", value : ""},
                {name : "User1", value : "U1"},
                {name : "User2", value : "U2"},
                {name : "User3", value : "U3"}
            ];
        });
    </script>
</head>
<body>
<div class="container">
    <div class="card card-container">
        <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
        <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
        <p id="profile-name" class="profile-name-card"></p>
        <form class="form-signin">
            <h5>Выберите пользователя:</h5>
            <div ng-app="myApp" ng-controller="myCtrl">
                <select ng-model="selectedUser" class="form-control">
                    <option ng-repeat="x in roles" value="{{x.value}}">{{x.name}}</option>
                </select>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
        </form><!-- /form -->
    </div><!-- /card-container -->
</div><!-- /container -->
</body>
</html>
