<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.bo.CarrierBOImpl,java.util.List,java.util.ArrayList,com.flyaway.model.carrier.Carrier"%>
<%@taglib prefix="rb" uri="WEB-INF/ctag.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Master List of Airlines</title>
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
CarrierBOImpl cbi=new CarrierBOImpl();
List<Carrier> l=new ArrayList<Carrier>();
l=cbi.searchCarrier();
if((l!=null) && (l.size()>0)){
	%>
	<rb:printCarrier cList="<%=l%>" />
	<%} %>
</body>
</html>