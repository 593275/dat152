<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h3>login</h3>
	<p><font color="red">${message}</font></p>
	<form action="login" method="post">
		<p>Username <input type="text" name="username" pattern="[^()/><\][\\\x22,;|]+"value="${username}"/></p>
		<p>Password <input type="password" name="password" value="${password}"/></p>
		<input type="hidden" name="client_id" value="${client_id}"/>
		<input type="hidden" name="response_type" value="${response_type}"/>
		<input type="hidden" name="scope" value="${scope}"/>
		<input type="hidden" name="redirect_uri" value="${redirect_uri}"/>
		<input type="hidden" name="state" value="${state}"/>
		<p><input type="submit" value="Log in"/></p>
	</form>
	<p><a href="index.jsp">Back</a></p>

</body>
</html>