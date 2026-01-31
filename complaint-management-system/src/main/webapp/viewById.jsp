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
        <td>${view.userId}</td>
    </tr>

    <tr>
        <th>Email</th>
        <td>${view.email}</td>
    </tr>

    <tr>
        <th>Password</th>
        <td>${view.password}</td>
    </tr>

    <tr>
        <th>Role</th>
        <td>${view.role}</td>
    </tr>

    <a href="readAllCourseEnrollment">View Complaint Details</a>
</table>
<a href="registration">Complaint Registration</a>
</body>
</html>