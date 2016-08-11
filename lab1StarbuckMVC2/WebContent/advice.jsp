<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Advice</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<table>
<c:set var="count" value="0" scope="page" />

   <c:forEach items="${list}" var="items">
   <c:choose>
     <c:when test = "${count%2==0}">
       <tr style="background-color:cyan">
           <td>${items}</td>
       </tr>
    </c:when>
     <c:otherwise>
     <tr style="background-color:yellow">
           <td>${items}</td>
       </tr>
    </c:otherwise>
     
  </c:choose>
       <c:set var="count" value="${count + 1}" scope="page"/>
   </c:forEach>

 </table>
<input type="submit" value="Back">
</body>
</html>