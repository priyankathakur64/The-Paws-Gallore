<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Pet Gallore</title>
</head>
<body>
<a href="home">HOME</a>
<a href="about">ABOUT</a>
<a href="service">SERVICE</a>
<a href="product">PRODUCTS</a>
<a href="contact">CONTACT</a>
<a href="logout">LOGOUT</a><br>
<h1>CONTACT</h1>
PLEASE FEEL FREE TO CONTACT US
<form action="contactdata" method="post">
<pre>
Name       <input type="text" name="name"><br><br>
Address    <input type="text" name="address"><br><br>
Email      <input type="email" name="email"><br><br>
Mobile No. <input type="number" name="mobile"><br><br>
Message    <input type="text" name="message"><br>
</pre>
<input type="submit" value="SEND MESSAGE">
<input type="reset" value="Clear">
</form>
</body>
</html>