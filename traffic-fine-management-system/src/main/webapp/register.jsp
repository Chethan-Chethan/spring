<html>
<head>
    <title>Traffic Fine</title>
</head>
<body>
<h2>Traffic Fine Entry</h2>

<form action="traffic" method="post">
    Vehicle Number: <input type="text" name="vehicleNo"><br><br>
     Rule Violated:
        <select name="ruleViolated">
            <option value="helmet">No Helmet</option>
            <option value="signal">Signal Jump</option>
            <option value="documents">No Documents</option>
        </select><br><br>
    Fine Amount: <input type="number" name="amount"><br><br>


    <input type="submit" value="Submit">
</form>

</body>
</html>
