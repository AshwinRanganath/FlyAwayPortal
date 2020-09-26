<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.flyaway.model.search.Search,java.text.SimpleDateFormat,java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>


</head>
<h3>Flyaway</h3>
<body>
	<form>
		<h4>Search for flights</h4>
		<table>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><label>Date of Travel</label></td>
				<td></td>
				<td></td>
				<td><input type="date" name=dot value=""></td>
			</tr>
			<tr>
				<td>From</td>
				<td></td>
				<td></td>
				<td><select name="source">
						<option value="select">select source city</option>
						<option value="Bangalore">Bangalore</option>
						<option value="Hyderabad">Hyderabad</option>
						<option value="Chennai">Chennai</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Delhi">Delhi</option>
				</select></td>
			</tr>
			<tr>
				<td>Towards</td>
				<td></td>
				<td></td>
				<td><select name="destination">
						<option value="select">select destination city</option>
						<option value="Bangalore">Bangalore</option>
						<option value="Hyderabad">Hyderabad</option>
						<option value="Chennai">Chennai</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Delhi">Delhi</option>
				</select></td>
			</tr>
			<tr>
				<td>Number of persons:</td>
				<td></td>
				<td></td>
				<td><select name="nop">
						<option value=0>You can enter a maximum of 10 passengers</option>
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
						<option value=3>4</option>
						<option value=5>5</option>
						<option value=6>6</option>
						<option value=7>7</option>
						<option value=8>8</option>
						<option value=9>9</option>
						<option value=10>10</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><input type="submit" name="search" value="Search">
				</td>
				<td></td>

			</tr>
			<tr>
				<td><a href="index.jsp">Admin Home</a></td>
			</tr>
		</table>
</body>
</form>
</html>
<% if(request.getParameter("search")!=null)
{
	//out.println(request.getParameter("nop"));
	String s1=new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis())).toString();
	String s2=request.getParameter("dot");
	String s=request.getParameter("source");
	String d=request.getParameter("destination");
	int i=s2.compareTo(s1);		
	if((request.getParameter("dot")==null)||(i<0))
	{
		request.setAttribute("errorMessage"," Do not select past date (or) date of travel is not selected");	
		out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
		request.removeAttribute("errorMessage");
	}else
if ((s.equals(d)))
		{
	request.setAttribute("errorMessage"," Source and Destination can not be same");	
	out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
	request.removeAttribute("errorMessage");
		}else 
			if(s.equals("select"))
			{
				request.setAttribute("errorMessage"," select a source");	
				out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
				request.removeAttribute("errorMessage");
					}
			else if(d.equals("select"))
			{
				
					request.setAttribute("errorMessage","Select a destination");	
					out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
					request.removeAttribute("errorMessage");
						
			} else
			if(Integer.parseInt(request.getParameter("nop"))==0)
			{
				request.setAttribute("errorMessage"," Select the number of passengers");	
				out.println("<br><h4 style='color:RED'>Error :"+request.getAttribute("errorMessage")+"</h4>");
				request.removeAttribute("errorMessage");
			}
		else{%>
<jsp:useBean id="search" class="com.flyaway.model.search.Search"></jsp:useBean>
<jsp:setProperty property="*" name="search" />
<%request.setAttribute("search", search);%>
<jsp:forward page="search" />

<%}}%>