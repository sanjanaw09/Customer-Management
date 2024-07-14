<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="req1" method="Get">
<center>
<h1>Login Page</h1>

<!-- Label and input for email -->
<label for="uname"><b>Email :</b></label>
<input type="email" placeholder="login id" name="email" required>
<br>

<!-- Label and input for password -->
<label for="psw"><b>Password :</b></label>
<input type="password" placeholder="Password" name="psw" required>
<br>

<!-- Submit button -->
<button type="submit">Submit</button>

</center>
</form>
</body>
</html>
