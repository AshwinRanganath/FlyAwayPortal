<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.bo.FlightsBOImpl,java.util.List,java.util.ArrayList,com.flyaway.model.flight.Flights"%>
<%@taglib prefix="rb" uri="WEB-INF/ftag.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Master List of Flights</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="adminHome.jsp">Admin Home</a></td>
			<td><a href="logut.jsp">Logout</a></td>
		</tr>
		<td>
			<h4>Master List of Airlines</h4>
		</td>
		</tr>
	</table>
	<%
FlightsBOImpl fbi=new FlightsBOImpl();
List<Flights> l=new ArrayList<Flights>();
l=fbi.searchFlight();
if((l!=null) && (l.size()>0)){%>
	<rb:printFlight flist="<%=l%>" />
	<%} %>

</body>
</html>