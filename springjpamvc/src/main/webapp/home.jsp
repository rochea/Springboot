<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
	<input type="text" name="aId"><br>
	<input type="text" name="aName"><br>
	<input type="text" name="tech"><br>
	<input type="submit"><br>
	</form>
	
	<form action="getAlien">
	<input type="text" name="aId"><br>
	<input type="submit"><br>
	</form><br><br>
	
	<form action="getTech">
	<input type="text" name="tech"><br>
	<input type="submit"><br>
	</form>

</body>
</html>