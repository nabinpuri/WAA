<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<form >

<input type = "text" name = "input1" size="2" value = "${calculator.input1}" /> + <input type = "text" name = "input2" size="2" value ="${calculator.input2}"/> = <input type = "text" name = "output1" size="2" value = "${calculator.output1}"><br/><br/>
<input type = "text" name = "input3" size="2" value = "${calculator.input3}" /> + <input type = "text" name = "input4" size="2" value ="${calculator.input4}"/> = <input type = "text" name = "output2" size="2" value = "${calculator.output2}"><br/><br/>
<input type = "submit" value = "Submit"/><br/>

</form>

</body>
</html>