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
        <th>Field</th>
        <th>Details</th>
    </tr>

    <tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>

    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>

        <tr>
            <td>Role</td>
            <td>${role}</td>
        </tr>
</table>

<a href="register.jsp">Complaint Registration</a>
<a href="readAllCourseEnrollment">View All Complaints </a>

</body>
</html>