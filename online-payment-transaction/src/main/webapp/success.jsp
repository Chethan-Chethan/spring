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
        <td>Phone Number:</td>
        <td>${phoneNumber}</td>
    </tr>

    <tr>
        <td>Transaction Id:</td>
        <td>${transactionId}</td>
    </tr>

    <tr>
        <td>Amount Sender Name:</td>
        <td>${amountSenderName}</td>
    </tr>

    <tr>
        <td>Amount:</td>
        <td>${amount}</td>
    </tr>

    <tr>
        <td>Amount Receiver Name:</td>
        <td>${amountReceiverName}</td>
    </tr>

    <tr>
        <td>Date:</td>
        <td>${date}</td>
    </tr>
</table>

<a href="register">Payment Registration</a>
<a href="readAllOnlinePayments">View All Payment Details</a>

</body>
</html>