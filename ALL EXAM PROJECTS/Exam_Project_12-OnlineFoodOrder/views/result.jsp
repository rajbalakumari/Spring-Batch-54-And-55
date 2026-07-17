<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Summary</title>
</head>

<body>

	<h2>Order Summary</h2>

	Customer Name : ${customerName}

	<br>
	<br> Food Item : ${foodItem}

	<br>
	<br> Price : ₹${price}

	<br>
	<br> Quantity : ${quantity}

	<br>
	<br> Delivery Address : ${address}

	<br>
	<br> Total Bill : ₹${total}

	<br>
	<br>

	<a href="${pageContext.request.contextPath}/index.jsp">Back</a>

</body>
</html>
