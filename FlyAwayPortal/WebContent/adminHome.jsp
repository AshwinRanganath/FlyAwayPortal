<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin page</title>
</head>

<body>
	<table>
		<tr>
			<td><a href="search.jsp">Home</a></td>
			<td><a href="logout">Logout</a></td>
		</tr>
		<td>
			<h1>Welcome Admin</h1>
		</td>
		</tr>
	</table>
	<a href="masterSD.jsp">Master List of Source and Destination</a>
	<br>
	<br>
	<br>
	<a href="masterCarrier.jsp">Master List of Airlines</a>
	<br>
	<br>
	<br>
	<a href="Flights.jsp">List of flights , source , destination,
		airline, price</a>
	<br>
	<br>
	<br>
	<a href="admin_change_password.jsp">Change Password</a>
	<br>
	<br>
	<br>
	<a href="logout">Logout</a>
</body>
</html>