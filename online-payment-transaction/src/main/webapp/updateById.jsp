<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<html>
<body>

<h2>Edit Payment</h2>

<form action="editById" method="post">

    <!-- Hidden ID -->
    <input type="hidden" name="id" value="${edit.id}" readonly/>

    Phone Number:
    <input type="text" name="phoneNumber" value="${edit.phoneNumber}" /><br><br>

    Transaction Id:
    <input type="text" name="transactionId" value="${edit.transactionId}" /><br><br>

    Sender Name:
    <input type="text" name="amountSenderName" value="${edit.amountSenderName}" /><br><br>

    Amount:
    <input type="number" name="amount" value="${edit.amount}" /><br><br>

    Receiver Name:
    <input type="text" name="amountReceiverName" value="${edit.amountReceiverName}" /><br><br>

    Date:
    <input type="date" name="date" value="${edit.date}" /><br><br>

    <button type="submit">Update</button>

</form>

</body>
</html>
