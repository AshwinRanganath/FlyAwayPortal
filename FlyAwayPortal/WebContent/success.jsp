<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>

</head>
<body>
	<%String u=(String)session.getAttribute("username"); 
if(u=="admin")
{%>
	<jsp:forward page="error.jsp"></jsp:forward>
	<%}
%>
	<h1>
		Hello
		<%=session.getAttribute("username")%>, You are in success page.
	</h1>
	<table>
		<tr>
			<td><a href="search.jsp">Home</a></td>
		</tr>
		<tr>
			<td></td>
		</tr>
		<tr>
			<td align="right"><a href="logout">Logout</a></td>
		</tr>
		<%
//int i=Integer.parseInt((String)session.getAttribute("nop"));
int i=Integer.parseInt((String)request.getParameter("nop"));
int j=0;
String[] s={"Name (Enter only alphabet)","Sex","","Age (Enter only numbers)"};
for(String a:s)
{
	out.print("<th>"+a+"</th>");
}
out.print("<form action='ticket' method='POST'>");
while(j<i)
	{
	out.print("<tr><td><input type='text' name='pname"+j+"' pattern='[A-Za-z]{2,}' required='required'></td><td><input type='radio' name='psex"+j+"' value='male' required='required'>Male<input type='radio' name='psex"+j+"' value='female' required='required'>Female</td><td><input type='hidden' value='"+u+"' name='puser'></td><td><input type='number' name='page"+j+"' min='0' max='100' required='required'></td></tr>");
	j++;
	}%>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td><input type='submit' name='Add' value='Add Passengers'></td>
		</tr>
		</form>
	</table>

</body>
</html>
<%
session.setAttribute("Book", request.getParameter("Book"));
session.setAttribute("nop", request.getParameter("nop"));
session.setAttribute("dot", request.getParameter("dot"));
%>
