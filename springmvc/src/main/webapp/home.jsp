<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "addAlien">
     Enter your Id 
    <input type="text" name="aId"> <br>
     Enter your Name
    <input type="text" name="aName"> <br>
    Enter your Marks
    <input type="text" name="aMarks"> <br>
    <input type="submit"> <br>
  </form><br><br>
  
  
  <form action="getAlien">
	<input type="text" name="aId"><br>
	<input type="submit"><br>
	</form>
	
	 <form action="getAmarks">
	<input type="text" name="aMarks"><br>
	<input type="submit"><br>
	</form>

</body>
</html>