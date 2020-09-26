<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dummy Payment gateway</title>
</head>
<body>
	<form action="payment" method="post">
		<table>

			<tr>
				<%
Double price=(Double)session.getAttribute("price");
int nop=Integer.parseInt((String)session.getAttribute("nop"));
out.print("Pay ticket price:"+price*nop);

%>
				<td><input type="submit" name="pay" value="pay"></td>
			</tr>
		</table>
</body>
</form>
</html>