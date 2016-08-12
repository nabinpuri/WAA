 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<spring:url var = "listproducturl" value="/listproducts"/>
<div id="global">
    <h4>The product has been saved.</h4>
<form:form modelAttribute="newproduct"  action= "${listproducturl}"  method="get">
        <h5>Details:</h5>
        Product Name: ${newproduct.name}<br/>
        Category: ${newproduct.category.name}<br/>
        Description: ${newproduct.description}<br/>
        Price: $${newproduct.price}
    
    <input id="submit" type="submit"  
         value="List products">
         </form:form>
    
</div>
</body>
</html>