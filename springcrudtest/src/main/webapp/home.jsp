<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<form action="addStud">
<label for="sId">Student ID: </label>
<input type="text" name=sId><br><br>
<label for="sName">Student Name: </label>
<input type="text" name=sName><br><br>
<label for="sDept">Student Department: </label>
<input type="text" name=sDept><br><br>
<label for="sPercent">Student Percentage: </label>
<input type="text" name=sPercent><br><br>

<input type="submit"><br>
<input type="reset"><br>
<button type="button" onclick="viewStud"><a href="/viewStud">View Studs</a></button>
</form>
</div>

</body>
</html>