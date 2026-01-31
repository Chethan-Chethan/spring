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
        <td>${view.id}</td>
        </tr>

        <tr>
        <th>Phone Number</th>
        <td>${view.phoneNumber}</td>
        </tr>

        <tr>
        <th>Transaction Id</th>
        <td>${view.transactionId}</td>
        </tr>

        <tr>
        <th>Sender Name</th>
        <td>${view.amountSenderName}</td>
        </tr>

        <tr>
        <th>Amount</th>
        <td>${view.amount}</td>
        </tr>

        <tr>
        <th>Receiver Name</th>
        <td>${view.amountReceiverName}</td>
        </tr>

        <tr>
        <th>Date</th>
        <td>${view.date}</td>
        </tr>
<a href="readAllOnlinePayments">View Online Payments</a>
</table>


</body>
</html>