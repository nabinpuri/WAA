<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body >
<div style="background-color:grey">
<h3 style="color:purple">And the result are</h3><br>
<c:set var="found" value="0" scope="page" />
  <c:choose>
    <c:when test = "${(number gt number1)}">
       <font color="green"><strong>The Number  ${number} is greater than ${number1}</strong></font><br>
       <c:set var="found" value="1" scope="page" />
    </c:when>
    <c:when test = "${(number lt number2) && (found ne 1)}">
       <font color="red"  ><strong>The Number  ${number} is less  than ${number2}</strong></font><br>
       <c:set var="found" value="1" scope="page" />
    </c:when>
    <c:when test = "${(number lt number3) && (found ne 1)}">
       <font color="blue"  ><strong>The Number  ${number} is equal to  ${number3}</strong></font><br>
    </c:when>
    <c:otherwise>
        <font color="green"  ><strong>The Number  ${number} is not greater than ${number1}</strong></font><br>
         <font color="red"  ><strong>The Number  ${number} is not less  than ${number2}</strong></font><br>
       <font color="blue"  ><strong>The Number  ${number} is not equal to  ${number3}</strong></font><br>
    </c:otherwise>
</c:choose>
</div>

</body>
</html>