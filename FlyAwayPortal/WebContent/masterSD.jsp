<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.bo.Master_S_D_BOImpl,java.util.List,java.util.ArrayList,com.flyaway.model.sd.Master_s_d"%>
<%@taglib prefix="rb" uri="WEB-INF/sdtag.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Master List of Source and destination</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="adminHome.jsp">Admin Home</a></td>
			<td><a href="logut.jsp">Logout</a></td>
		</tr>
		<td>
			<h4>Master List of Source and Destination</h4>
		</td>
		</tr>
	</table>

	<%
Master_S_D_BOImpl mbi=new Master_S_D_BOImpl();
List<Master_s_d> l=new ArrayList<Master_s_d>();
l=mbi.searchSD();
if((l!=null) && (l.size()>0)){
%>
	<rb:printSD sdlist="<%=l%>" />
	<%} %>
</body>
</html>

