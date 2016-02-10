<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculatrice</title>
</head>	
<body>
	
	 <h2>Please fill this table values</h2>
	 <p>
	 <form action="<%=request.getContextPath()%>/BonusServlet" method="POST">
		 <table>
		    <tr>
		        <th>SSN</th>
		        <th>Bonus</th>
		    </tr>
		     <tr>
	            <td><input type="text" name="ssn1"></td>
	            <td><input type="text" name="bonus1"></td>
		      </tr>
		      <tr>
	            <td><input type="text" name="ssn2"></td>
	            <td><input type="text" name="bonus2"></td>
		      </tr>
	     </table>
     	<input type="submit" value="Send Form">
	 </form>
	</p>
</body>
</html>