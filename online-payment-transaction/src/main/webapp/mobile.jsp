<html>
<body>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<form action="register" method="post">

<label for="phoneNumber"><b>Phone Number:</b></label>
<input type="number" id="phoneNumber" name="phoneNumber" required>
<br>  <br>

<label for="transactionId"><b>Transaction Id:</b></label>
<input type="number" id="transactionId" name="transactionId" required>
<br>  <br>

<label for="amountSenderName"><b>Amount Sender Name:</b></label>
<input type="text" id="amountSenderName" name="amountSenderName" required>
<br>  <br>

<label for="amount"><b>Amount:</b></label>
<input type="number" id="amount" name="amount" required>
<br>  <br>

<label for="amountReceiverName"><b>Amount Receiver Name:</b></label>
<input type="text" id="amountReceiverName" name="amountReceiverName" required>
<br>  <br>

<label for="date"><b>Date:</b></label>
<input type="date" id="date" name="date" required>
<br>  <br>

<button type="submit">Register</button>
</form>
<a href="readAllOnlinePayments">View All Payment Details</a>

</body>
</html>
