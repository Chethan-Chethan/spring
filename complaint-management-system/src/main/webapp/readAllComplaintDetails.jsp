<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration Success</title>

<style>
    table {
        border-collapse: collapse;
        margin: 50px auto;
        width: 60%;
        text-align: center;
    }

    th, td {
        border: 1px solid black;
        padding: 12px;
    }

    th {
        background-color: #f2f2f2;
    }

    h1 {
        text-align: center;
        color: green;
    }

    a {
        display: block;
        text-align: center;
        margin-top: 20px;
        text-decoration: none;
        font-weight: bold;
    }
</style>
</head>

<body>

<h1>Registration Successful</h1>

<table>
    <tr>
        <th>User Id</th>
        <th>Email</th>
        <th>Password</th>
        <th>Role</th>
        <th>Delete Actions</th>
        <th>View Actions</th>
    </tr>

    <c:forEach var="complaint" items="${read}">
    <tr>
        <td>${complaint.userId}</td>
        <td>${complaint.email}</td>
        <td>${complaint.password}</td>
        <td>${complaint.role}</td>
        <td><a href="deleteComplaint?userId=${complaint.userId}">Delete</a></td>
        <td><a href="viewById?userId=${complaint.userId}">View</a></td>
    </tr>
    </c:forEach>
</table>
<a href="register">Complaint Registration</a>
</body>
</html>