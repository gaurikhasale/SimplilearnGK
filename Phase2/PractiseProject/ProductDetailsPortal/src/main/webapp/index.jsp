<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

<h2>Enter Product Details:</h2>
<hr>
<form action="AppServlet">
<input type="text" name="productId" placeholder="PRODUCT ID"><br><br>
<input type="text" name="productName" placeholder="PRODUCT NAME"><br><br>
<input type="text" name="productPrice" placeholder="PRODUCT PRICE"><br><br>
<input type="submit" value="ENTER">
</form>

</body>
</html>