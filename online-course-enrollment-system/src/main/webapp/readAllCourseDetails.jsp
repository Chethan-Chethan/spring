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
        <th>Student Id</th>
        <th>Student Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Course Name</th>
        <th>Course Fee</th>
        <th>Delete Action</th>
        <th>View Action</th>
        <th>Edit Actions</th>
    </tr>

    <c:forEach var="course" items="${fetching}">
    <tr>
        <td>${course.id}</td>
        <td>${course.studentName}</td>
        <td>${course.email}</td>
        <td>${course.phoneNumber}</td>
        <td>${course.courseName}</td>
        <td>${course.courseFee}</td>
        <td><a href="deleteById?id=${course.id}">Delete</a></td>
        <td><a href="viewById?id=${course.id}">View</td>
        <td><a href="editById?id=${course.id}">Edit</a></td>
    </tr>
    </c:forEach>
</table>
<a href="register.jsp">Course Enrollment Registration</a>
</body>
</html>