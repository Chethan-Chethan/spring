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
        <th>Challan Id</th>
        <th>Vehicle Number</th>
        <th>Rule Violated</th>
        <th>Fine Amount</th>
        <th>Delete Action</th>
        <th>View Action</th>
        <th>Edit Actions</th>
    </tr>

    <c:forEach var="fine" items="${fetch}">
    <tr>
        <td>${fine.id}</td>
        <td>${fine.vehicleNumber}</td>
        <td>${fine.violatedRule}</td>
        <td>${fine.fineAmount}</td>
        <td><a href="deleteTrafficFineById?id=${fine.id}">Delete</a></td>
        <td><a href="viewById?id=${fine.id}">View</a></td>
        <td><a href="editById?id=${fine.id}">Edit</a></td>
    </tr>
    </c:forEach>
</table>
<a href="register.jsp">Traffic Fine Registration</a>
</body>
</html>