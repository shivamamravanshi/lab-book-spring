<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>Welcome to the Trainee Management System </h2>
<form method="get" action="processlogin">
<label> ID </label>
<div>
<input type="number" name="id">
</div>

<label>Password</label>
<div>
<input type="text" name="password">
</div>

<input type="submit" value="Login">

</form>
</body>
</html>
