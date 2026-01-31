<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<h2>Login Successful</h2>

<c:forEach var="ticket" items="${tickets}">
    <hr>
    Name: ${ticket.name}<br>
    Phone: ${ticket.phoneNumber}<br>
    Email: ${ticket.email}<br>
    Boarding Place: ${ticket.boardingPlace}<br>
    Destination: ${ticket.destination}<br>
    Created At: ${ticket.createdAt}<br>
</c:forEach>

<a href="index">Home Page</a>
