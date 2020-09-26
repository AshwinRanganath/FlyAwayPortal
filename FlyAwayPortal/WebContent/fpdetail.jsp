<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.model.passenger.Passenger,java.util.List,com.flyaway.bo.SearchBOImpl,com.flyaway.model.flight.Flights"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm booking details</title>

</head>
<body>

	<form action="pay.jsp" method="post">
		<a href="logout">Logout</a> <a href="search.jsp">Search Again</a><br>
		<br> <br> <br> <br> <br> Flight details
		<table border=1>
			<%
SearchBOImpl sbi=new SearchBOImpl();
Flights f=sbi.getFlight(Integer.parseInt((String)session.getAttribute("Book")));
session.setAttribute("price",f.getFprice());
String[] headers={"source","destination","airlines","Price","arrival","departure","available","Flight number","Date of Travel"};
out.print("<tr>");
for(String a:headers)
{
out.print("<th>"+a+"</th>");	
}
out.print("<tr>");
out.print("<tr><td>"+f.getSource()+"</td><td>"+f.getDestination()+"</td><td>"+f.getAirlines()+"</td><td>"+f.getFprice()+"</td><td>"+f.getArrival_time_to_destination()+"</td><td>"+f.getDestination_from_source_time()+"</td><td>"+f.getAvailable()+"</td><td>"+f.getFid()+"</td><td>"+session.getAttribute("dot")+"</td></tr>");

%>
		</table>
		<br> <br> <br> <br> <br> <br> <br>
		<br> Passenger details
		<table border=1>

			<tr>
				<th>Name</th>
				<th>Sex</th>
				<th>Age</th>

			</tr>
			<% 
List<Passenger> pl=(List<Passenger>)session.getAttribute("plist");
for(Passenger p:pl)
{
	out.print("<tr><td>"+p.getP_name()+"</td><td>"+p.getP_sex()+"</td><td>"+p.getP_age()+"</td></tr>");
}
%>
		</table>
		<input type="submit" name="confirm" value="Confirm">

	</form>
</body>
</html>