<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">
Invalid Login credential
</font><br><br>
<font color="blue">
Please check and Try again..!!
</font>
<h1>LOGIN</h1>
<form action="validlogin" method="post">
<pre>
Username <input type="text" name="username"><br><br>
Password <input type="password" name="password"><br>
</pre>
<input type="submit" value="LOGIN">
<input type="reset" value="CLEAR"><br><br>
Don't have account?
<a href="register">Register</a>
</form>
</body>
</html>