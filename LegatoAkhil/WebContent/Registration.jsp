<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegForm</title>
</head>
<body>
<%session.getAttribute("session"); %>
<%System.out.println("session id" + session.getId()); %>

<% application.getInitParameter("context");%>

<p>Hello JsP</p>

  Hi <%=session.getAttribute("session")%>
  
  <%=application.getInitParameter("context") %>
<form onsubmit="return Validate()" action="Registration">

			UserId:
			<input type="text"  id = "id1" name="UserId" value=<%=request.getParameter("UserId")%>  /><br/>
			
			First Name:
			<input type="text"  id = "id1" name="Firstname"  /><br/>
			<span id ="nameerror"></span>
			
			
			
			Gender:
			<input type="radio" name="gender" class= "g1" value="Male" /> Male
			<input type="radio" name="gender" class= "g1" value="Female"  /> Female&nbsp;<br\>
			<span class="gendererror"></span>
			<br/>
			
			Phoneno:
			<input type="text" name="phoneno"/>&nbsp;<br>
			
			
			Technology:
			<select name="Technologies" class="t1" >
			<option value="html" class="t1"  name="technologies" >HTML</option>
			<option value="CSS" class="t1" name="technologies" >CSS</option>
			<option value="bootstrap" class="t1" name="technologies" >Bootstrap</option>
			<option value="js" class="t1" name="technologies" >JS</option>
			</select>
			<span class="techerror"></span>
			<br/>
			
			<input type = "submit"> 
</form>
<!--  
<script type=text/javascript>
function Validate()
{

	
var flagName = nameValidate(name);
var flagGender = genderValidate();
var flagCity = cityValidate();
var flagtechnology = technologyValidate();


if(flagName && flagGender && flagCity && flagtechnology)
return true;
else
return false;

}
	function nameValidate(name)
	{
		var name=document.getElementById("id1").value;
		if(name.match("^[A-Za-z]+$"))
		return true;
		else
			document.getElementById("nameerror").innerHTML="Name can have only characters";	
		document.getElementById("nameerror").style.color="red";
		return false;
	}
	
	function genderValidate(gender)
	{
		var flag = false;
		var gender = document.getElementsByClassName("g1");
		for(var i = 0; i<gender.length;i++){
			if(gender[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}
		
		if(!flag){
			document.getElementsByClassName("gendererror").innerHTML="one of the radio button is not selected";
				document.getElementsByClassName("gendererror").style.color="red";
		}
		
		return flag;
	
	}
	function cityValidate(city)
	{
		var flag = false;
		var city=document.getElementsByClassName("c1");
		for(var i = 0; i<city.length;i++){
			if(city[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}	
		
		if(!flag){
			document.getElementsByClassName("cityerror").innerHTML="one of the checkbox is not selected";
				document.getElementsByClassName("cityerror").style.color="red";
		}
			
		return flag;
	}
	
	function technologyValidate()
	{
		var flag = false;
		var technology=document.getElementsByClassName("t1");
		for(var i = 0; i<technology.length;i++){
			if(technology[i].checked){
				flag = true;
				console.log(flag);
			break;
		}
		}	
		
		if(!flag){
			document.getElementsByClassName("techerror").innerHTML="please select an option";
				document.getElementsByClassName("techerror").style.color="red";
		}
		return flag;
		
	}	


</script>-->

</body>
</html>