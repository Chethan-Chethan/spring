<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<html>
<body>
<h1>Registration Successful</h1>

<table>
    <tr>
        <th>Field</th>
        <th>Details</th>
    </tr>

    <tr>
        <td>Name:</td>
        <td>${name}</td>
    </tr>

    <tr>
        <td>Phone Number:</td>
        <td>${phoneNumber}</td>
    </tr>

    <tr>
        <td>Email:</td>
        <td>${email}</td>
    </tr>

    <tr>
        <td>Password:</td>
        <td>${password}</td>
    </tr>

    <tr>
        <td>Boarding Place:</td>
        <td>${boardingPlace}</td>
    </tr>

    <tr>
        <td>Destination:</td>
        <td>${destination}</td>
    </tr>

    <tr>
        <td>Created At:</td>
        <td>${ticket.createdAt}</td>
    </tr>
</table>

<a href="index">Home</a>


</body>
</html>
