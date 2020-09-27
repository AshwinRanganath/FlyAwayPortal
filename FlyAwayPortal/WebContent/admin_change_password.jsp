<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.bo.LoginBOImpl,com.flyaway.model.login.Login,com.flyaway.exception.FlyawayException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin password Page</title>
</head>
<form>
	<body>
		<table>
			<tr>
				<td><a href="adminHome.jsp">Admin Home</a></td>
				<td><a href="logout">Logout</a></td>
			</tr>

			</tr>
		</table>

		<h1>Change Admin password here</h1>
		Enter current password
		<input type=password name="cpwd" value="password">
		<br> Enter new password
		<input type=password name="npwd" value="newpassword">
		<br> Enter reenter new password
		<input type=password name="nrpwd" value="newrepassword">
		<br>
		<input type="submit" name="change" value="Change Password">
</form>
</body>
</html>

<%
if(request.getParameter("change")!=null)
{
	boolean b=false;
	
	if(!request.getParameter("npwd").equals(request.getParameter("nrpwd")) || (request.getParameter("npwd").length()<8))
	{
		request.setAttribute("errorMessage"," Passwords do not match (or) Password length must be 8 characters at least");	
		out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
		request.removeAttribute("errorMessage");
	}
	
	else
	{
		LoginBOImpl lbi=new LoginBOImpl();
		try
		{
			boolean c=false;
			Login ll=new Login();
			ll.setUsername("admin");
			ll.setPassword(request.getParameter("cpwd"));
		    c=lbi.isValidUser(ll);
		    if(c)
			lbi.changePassword("admin", request.getParameter("npwd"));
%>
<jsp:forward page="adminHome.jsp"></jsp:forward>
<%
		}
		catch(FlyawayException e)
		{
			out.println("<br><h4 style='color:RED'>"+e.getMessage()+"</h4>");
		}
	}
}
%>