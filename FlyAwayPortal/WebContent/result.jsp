<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.model.flight.Flights,com.flyaway.bo.SearchBOImpl,com.flyaway.model.search.Search,java.util.ArrayList,java.util.List"%>
<%@taglib prefix="rb" uri="WEB-INF/rtag.tld"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>

</head>
<body>
	<table>
		<tr>
			<td><a href="search.jsp">Search Again</a></td>
			<td></td>
		</tr>
		<td>
			<h4>List of available flights</h4>
		</td>
		</tr>
	</table>
</body>
</html>
<% 
//Flights f=(Flights)request.getAttribute("l");
List<Flights> af=(ArrayList<Flights>)request.getAttribute("l");
Search s=(Search)request.getAttribute("s");
%>

<rb:printResults rlist="<%=af%>" s="<%=s%>" />



