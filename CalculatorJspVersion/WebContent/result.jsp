<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calc2" method="get">
<input type = "text" name = "add1" size = "2"  value =  ${add1} />
<input type = "text" name = "add2" value = ${add2} size = "2"/>=
<input type = "text" name = "sum" value = ${resultadd}  size = "2" readonly/><br/>
<input type = "text" name = "mult1" value = ${mul1} size = "2"/>*
<input type = "text" name = "mult2" value = ${mul2}  size = "2"/>=
<input type = "text" name = "product" value = ${resultmul}    size = "2" readonly/><br/>
<input type = "submit" value = "Submit"/>

</form>
</body>
</html>