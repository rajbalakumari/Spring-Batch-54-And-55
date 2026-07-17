<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Food Order</title>
</head>

<body>

	<h2>Online Food Order System</h2>

	<form action="order" method="post">

		Customer Name : <input type="text" name="customerName"> <br>
		<br> Food Item : <input type="text" name="foodItem"> <br>
		<br> Price : <input type="number" name="price"> <br>
		<br> Quantity : <input type="number" name="quantity"> <br>
		<br> Delivery Address : <input type="text" name="address">

		<br>
		<br> <input type="submit" value="Place Order">

	</form>

</body>
</html>
