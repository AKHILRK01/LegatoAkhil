<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,com.login.HibernateUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% HibernateUtil util = new HibernateUtil();
 util.createSessionFactory(); %>
 
<form action="LoginServlet">


UserId:
<input type = "text" placeholder="please enter your name" name="UserId" id="id1" /><br/>
<span id="error1"></span>
<br/>

Password:
<input type = "text" placeholder="please enter your password"  name="password" id="id2"/><br/>
<span id ="error2"></span><br/>


<input type="submit" onclick="validate()" />

<span id="time"></span>
<!-- 
<script>
 
setInterval(getTime, 1000);

function getTime() {
  var d = new Date();
  document.getElementById("time").innerHTML = new Date();
  var t = d.toLocaleTimeString();
  document.getElementById("time").innerHTML = t;
}


function validate()
{
	var name=document.getElementById("id1").value;
	var password=document.getElementById("id2").value;
	
	if(name.trim().toLowerCase()=="admin" && password.trim()=="admin")
		{
	return true;
		}
	
	else if(name.trim()=="" && password.trim=="")
	{
	document.getElementById("error1").innerHTML="name cannot spaces";
	document.getElementById("error2").innerHTML="password can have spaces ";
	return false;
	}
else if(name.trim()=="")
{
document.getElementById("error1").innerHTML="name cannot spaces";
document.getElementById("error2").innerHTML="";
return false;
}
else if(password.trim()=="")
{
	document.getElementById("error1").innerHTML="";
	document.getElementById("error2").innerHTML="password can have spaces ";
return false;
}
else 
	{
	
	document.getElementById("error1").innerHTML="invalid username";
	document.getElementById("error2").innerHTML="invalid password";
	return false;
	}
	
}



</script>-->

</form>

</body>
</html>