<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<spring:url var = "addstudent" value="/registration"/>
<h1>Registration Formsss</h1><br />
<div style="background-color:grey;width:50%;padding:10px">
<form:form modelAttribute="student" action="${addstudent}" method="post">
		<p style="background-color:white">
	 		     <form:errors path="*" cssStyle="color : red;" /> 
	        </p>
		
	 <p>
		  <label for="fname"><spring:message code="Student.firstName" />  </label>
		  <form:input id="fname" path="firstName" tabindex="1"/>
		  <div style="text-align: left;">
 				<form:errors path="firstName" cssStyle="color : red;" /> 
 			</div>
	  </p>
	    <p>
		  <label for="lname"><spring:message code="Student.lastName" /> </label>
		  <form:input id="lname" path="lastName" tabindex="2"/>
		  <div style="text-align: left;">
 				<form:errors path="lastName" cssStyle="color : red;" /> 
 			</div>
	  </p>
	  <p>
		  <label for=email><spring:message code="Student.email" />  </label>
		  <form:input id="email" path="email" tabindex="3"/>
		 <div style="text-align: left;">
 				<form:errors path="email" cssStyle="color : red;" /> 
 			</div>
	  </p>
	  <p>
		  <label for="gender"><spring:message code="Student.gender" />  </label>
		  <form:select path="gender">
		  <form:option value="Male" label="Male"/>
		  <form:option value="Female" label="Female"/>
		</form:select>
	  </p>
	  <p>
		  <label for="birthday"><spring:message code="Student.birthday" />  </label>
		  <form:input id="birthday" path="birthday" tabindex="5"/>
		  <div style="text-align: left;">
 				<form:errors path="birthday" cssStyle="color : red;" /> 
 			</div>
	  </p>
	   <p>
		  <label for="phone"><spring:message code="Student.phone" />  </label>
		  <form:input id="phone1" path="phone.area" tabindex="6"/>
		  <form:input id="phone2" path="phone.prefix" tabindex="7"/>
		  <form:input id="phone3" path="phone.number" tabindex="8" placeholder='number'/>
		  <div style="text-align: left;">
 				<form:errors path="phone.area" cssStyle="color : red;" /> 
 				<form:errors path="phone.prefix" cssStyle="color : red;" /> 
 				<form:errors path="phone.number" cssStyle="color : red;" /> 
 			</div>
	  </p>
	  <p id="buttons">
            <input id="submit" type="submit" tabindex="9" 
                value="Register">
        </p>
</form:form>

</div>

</body>
</html>

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>