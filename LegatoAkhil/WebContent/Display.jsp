<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ page import="java.util.*,com.login.Customer" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="DisplayAll">
<input type="submit" value="Display all"/>
<br/>
<select name="userid">
<option value="">Please select User Id</option>
<% List userids=(List)session.getAttribute("userids");
	if(userids!=null){
		Iterator itr = userids.iterator();
		while(itr.hasNext()){
			Integer userId=(Integer) itr.next();
		
%>

<option value=<%=userId%> ><%=userId%></option>
<%}} %>
</select>
<input type="submit" formaction="DisplayById" value="DisplayById"/>

</form>
<form>
<table border=2>
<tr> <td>User Id</td> <td>User Name</td> <td>User Phone</td> </tr>

	<% List customers=(List)request.getAttribute("customers");
	if(customers!=null){
		Iterator itr = customers.iterator();
		while(itr.hasNext()){
			Customer customer =(Customer) itr.next();
		
%>
<tr>
<td><%=customer.getUserId()%></td>
<td><%=customer.getName()%></td>
<td><%=customer.getPhoneNo()%></td>
</tr>
<%}} else{%>
	
<tr colspan="3">No Data found</tr>
<%} %>
</table>
			
</form>
</body>
</html>