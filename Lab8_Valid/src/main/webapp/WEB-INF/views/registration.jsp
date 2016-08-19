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
<h1>Registration Form</h1><br />
<form:form modelAttribute="student" action="${addstudent}" method="post">
	 <p>
		  <label for="name"><spring:message code="Student.firstName" />  </label>
		  <form:input id="fname" path="firstName" tabindex="1"/>
	  </p>
	  <p>
		  <label for="name"><spring:message code="Student.lastName" />  </label>
		  <form:input id="fname" path="lastName" tabindex="2"/>
	  </p>
	  <p>
		  <label for="name"><spring:message code="Student.email" />  </label>
		  <form:input id="fname" path="email" tabindex="3"/>
	  </p>
	  <p>
		  <label for="name"><spring:message code="Student.gender" />  </label>
		  <form:select path="gender">
		  <form:option value="Male" label="Male"/>
		  <form:option value="Female" label="Female"/>
		</form:select>
	  </p>
	  <p>
		  <label for="name"><spring:message code="Student.birthday" />  </label>
		  <form:input id="fname" path="birthday" tabindex="5"/>
	  </p>
	   <p>
		  <label for="name"><spring:message code="Student.phone" />  </label>
		  <form:input id="fname" path="phone.area" tabindex="6"/>
		  <form:input id="fname" path="phone.prefix" tabindex="7"/>
		  <form:input id="fname" path="phone.number" tabindex="8"/>
	  </p>
	  <p id="buttons">
            <input id="reset" type="reset" tabindex="9">
            <input id="submit" type="submit" tabindex="10" 
                value="Register">
        </p>
</form:form>

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>