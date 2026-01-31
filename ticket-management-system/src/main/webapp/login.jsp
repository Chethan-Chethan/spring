<html>
<body>

<h2>Login</h2>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<form action="login" method="post">
    Email: <input type="text" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    <button type="submit">Login</button>
</form>

</body>
</html>
