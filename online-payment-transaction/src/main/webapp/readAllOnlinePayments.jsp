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
        <th>Payment Id</th>
        <th>Phone Number</th>
        <th>Transaction Id</th>
        <th>Sender Name</th>
        <th>Amount</th>
        <th>Receiver Name</th>
        <th>Date</th>
        <th>Delete Actions</th>
        <th>Read Actions</th>
        <th>Update Actions</th>
    </tr>

    <c:forEach var="item" items="${list}">
    <tr>
        <td>${item.id}</td>
        <td>${item.phoneNumber}</td>
        <td>${item.transactionId}</td>
        <td>${item.amountSenderName}</td>
        <td>${item.amount}</td>
        <td>${item.amountReceiverName}</td>
        <td>${item.date}</td>
        <td><a href="deleteOnlinePayment?id=${item.id}">Delete</a></td>
        <td><a href="viewById?id=${item.id}">View</a></td>
        <td><a href="editById?id=${item.id}">Edit</a></td>


    </tr>
    </c:forEach>
</table>
<a href="registration">Payment Registration</a>

</body>
</html>