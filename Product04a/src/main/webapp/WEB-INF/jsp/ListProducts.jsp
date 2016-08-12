<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h2>List of Products</h2>
<spring:url var = "addproduct" value="/product"/>

<table>
		<tr><th>Name</th><th>Category</th><th>Description</th></tr>

	<c:forEach var="product" items = "${productlist}">
		<tr>
		<td>${product.name}</td>
		<td>${product.category.name}</td>
		<td>${product.description}</td>
		</tr>
	</c:forEach>
</table>   
<form:form modelAttribute="newproduct"  action= "${addproduct}"  method="get">
    <form action="product" method="get">
           <input id="submit" type="submit"  
                value="Add product">
	</form>
	</form:form>
     
</div>
</body>
</html>