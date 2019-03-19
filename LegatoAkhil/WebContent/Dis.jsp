<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.util.*,com.login.*" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%session.getAttribute("session");%>
<%session.getId(); %>
<%

ArrayList<Customer> a1 = (ArrayList<Customer>)request.getAttribute("customer");
Iterator<Customer> itr = a1.iterator();

while(itr.hasNext()) {
	Customer cst=itr.next();
%>
<tr>
<td><%=cst.getName() %></td>
<td><%=cst.getGender() %></td>
<td>
<%String technology="";

for(int i=0;i<cst.getTechnologies().length;i++)
{
	technology = technology+cst.getTechnologies()[1];
}
%>
<%=technology%></td>
</tr>
<% }  %>



<% 

String[] technologies = request.getParameterValues("technologies");

String technology = "";

for(int i=0; i < technologies.length;i++)
{
	technology = technology +","+ technologies[i];
}

%>

<table border=2>
<tr>
<th>Employee Name</th><th>  Gender  </th><th>  Cities  </th>
</tr>
<tr>
<td><%= request.getParameter("name")%></td>
<td><%= request.getParameter("gender") %></td>


<td><%= technology %></td>
</tr>
</table>

</body>
</html>