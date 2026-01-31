<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f3f4f6;
        }

        /* Navbar */
        .navbar {
            background: #1f2937;
            padding: 15px;
            color: white;
            font-size: 20px;
        }

        .navbar span {
            float: right;
            font-size: 14px;
        }

        /* Login box */
        .container {
            width: 360px;
            margin: 80px auto;
            background: white;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 15px;
            background: #2563eb;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Footer */
        .footer {
            background: #1f2937;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>

    <!-- NAVBAR -->
    <div class="navbar">
        Helpdesk System
        <span>Login</span>
    </div>

    <!-- LOGIN FORM -->
    <div class="container">
        <h2 style="text-align:center;">User Login</h2>

        <form action="editById" method="post">


        <input type="hidden" name="id" value="${search.id}" readonly>


        <label>Student Name</label>
        <input type="text" name="studentName" required value="${search.studentName}">

            <label>Email</label>
            <input type="text" name="email" required value="${search.email}">

            <label>Phone Number</label>
            <input type="text" name="phoneNumber" required value="${search.phoneNumber}">

            <label>Course Name</label>
            <input type="text" name="courseName" required value="${search.courseName}">

            <label>Course fee</label>
            <input type="text" name="courseFee" required value="${search.courseFee}">

            <button type="submit">Login</button>
        </form>

        <!-- Error Message -->
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>
            <p style="color:red; text-align:center;"><%= error %></p>
        <%
            }
        %>
    </div>

    <!-- FOOTER -->
    <div class="footer">
        © 2026 Helpdesk System | All Rights Reserved
    </div>

</body>
</html>
