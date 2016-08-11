<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator Result</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<div style="color:red">
<c:if test="${errors != null}">
     
     <p id="errors" >
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 </c:if>
</div>

<form action="calculate" method="post">
<input type = "text" name = "inputadd1" size="2" value = "${form.inputadd1}" /> + <input type = "text" name = "inputadd2" size="2" value ="${form.inputadd2}"/> = <input type = "text" name = "resultadd" size="2" value = "${form.resultadd}"><br/><br/>
<input type = "text" name = "mul1" size="2" value = "${form.mul1}" /> + <input type = "text" name = "mul2" size="2" value ="${form.mul2}"/> = <input type = "text" name = "resultMul" size="2" value = "${form.resultMul}"><br/><br/>
<input type = "submit" value = "Submit"/><br/>

</form>
</body>
</html>