<html>
<body>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<form action="registration" method="post">

<label for="customerName"><b>Phone Number:</b></label>
<input type="text" id="customerName" name="customerName" required>
<br>  <br>

<label for="phoneNumber"><b>Transaction Id:</b></label>
<input type="number" id="phoneNumber" name="phoneNumber" required>
<br>  <br>

<label for="vehicleNumber"><b>Amount Sender Name:</b></label>
<input type="text" id="vehicleNumber" name="vehicleNumber" required>
<br>  <br>

<label for="serviceType"><b>Amount:</b></label>
<input type="text" id="serviceType" name="serviceType" required>
<br>  <br>

<label for="serviceCost"><b>Amount Receiver Name:</b></label>
<input type="number" id="serviceCost" name="serviceCost" required>
<br>  <br>

<button type="submit">Register</button>
</form>
<a href="readAllOnlinePayments">View All Payment Details</a>

</body>
</html>
