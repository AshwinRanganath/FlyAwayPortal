<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.bo.LoginBOImpl, com.flyaway.exception.FlyawayException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
</head>
<body>
	<h1>Enter your details below</h1>
	<form method="post">
		<table name="signup_tbl">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="Male">Male<input
					type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td>User name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="contact"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="password"></td>
			</tr>
			<tr>
				<td>re enter Password</td>
				<td><input type="password" name="password1" value="password"></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" name="register"
					value="Register"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="hidden" name="role" value="user"></td>
			</tr>
		</table>
	</form>
</body>
</html>


<% if(request.getParameter("register")!=null)
{
	request.setAttribute("Book", request.getParameter("Book"));
	request.setAttribute("nop", request.getParameter("nop"));
	request.setAttribute("dot", request.getParameter("dot"));
%>
<jsp:useBean id="login" class="com.flyaway.model.login.Login"></jsp:useBean>
<jsp:setProperty property="*" name="login"></jsp:setProperty>



<% 
try{
	
LoginBOImpl lb=new LoginBOImpl();
//out.println(login);
boolean b=false;
b=lb.insertUser(login);
if(!request.getParameter("password").equals(request.getParameter("password1")))
{
	request.setAttribute("errorMessage"," Passwords do not match");	
	out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
	request.removeAttribute("errorMessage");
}
if(b==false)
{
	request.setAttribute("errorMessage","Issue with DB, contact admin");
	out.println("<br><h4 style='color:RED'>Error: "+request.getAttribute("errorMessage")+"</h4>");
	request.removeAttribute("errorMessage");
}
else
{
request.setAttribute("newUser", "true")	;
}
//else 
	
/* if(b==false)
{
	out.println("<br>Error: Contact admin");
} */
}
catch(FlyawayException e)
{
	out.println("<br><h4 style='color:RED'>"+e.getMessage()+"</h4>");

}

%>

<jsp:forward page="index.jsp" />
<%}
	
	%>




