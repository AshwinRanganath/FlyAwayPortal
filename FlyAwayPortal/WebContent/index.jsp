<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flyaway</title>
</head>
<body>
	<form action=login method="post">
		<h2>Flyaway Login</h2>
		<table align="center">
			<tr>

				<td>User id</td>
				<td><input type="text" name=username value=userid></td>
			</tr>
			<tr>

				<td>Password</td>
				<td><input type="password" name=password value=password></td>
			</tr>
			<tr>

				<td align="right"><input type="submit" name=submit value=login></td>

			</tr>
			<tr>
				<td></td>
				<td align="right">New user? <a
					href="signup.jsp?Book=<%=request.getAttribute("Book")%>&nop=<%=request.getAttribute("nop")%>&dot=<%=request.getAttribute("dot")%>">Sign
						Up</a></td>


			</tr>

		</table>
		<%
if((String)request.getAttribute("newUser")=="true")
{
	out.println("User name created successfully");
	out.println("<br>");
	out.println("You can login with your new user id");
}
String s=(String)request.getAttribute("Book");

request.setAttribute("Book",s);
String s1=(String)request.getAttribute("nop");

request.setAttribute("nop",s1);
%>
		<input type="hidden" name="Book"
			value="<%=request.getAttribute("Book")%>" /> <input type="hidden"
			name="nop" value="<%=request.getAttribute("nop")%>" /> <input
			type="hidden" name="dot" value="<%=request.getAttribute("dot")%>" />

	</form>
</body>
</html>

