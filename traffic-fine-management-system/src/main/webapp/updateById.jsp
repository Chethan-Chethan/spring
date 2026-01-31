<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<html>
<body>

<h2>Edit Payment</h2>

<form action="editById" method="post">

    <!-- Hidden ID -->
    <input type="hidden" name="id" value="${update.id}" readonly/>

    Phone Number:
    <input type="text" name="vehicleNumber" value="${update.vehicleNumber}" /><br><br>

    Transaction Id:
    <input type="text" name="violatedRule" value="${update.violatedRule}" /><br><br>

    Sender Name:
    <input type="number" name="fineAmount" value="${update.fineAmount}" /><br><br>

    <button type="submit">Update</button>

</form>

</body>
</html>
