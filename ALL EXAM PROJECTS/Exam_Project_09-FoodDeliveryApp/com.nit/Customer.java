package com.nit;

public class Customer {

	private int customerId;
	private String customerName;
	private String restaurantName;
	private double orderAmount;
	private double distance;

	public Customer(int customerId, String customerName, String restaurantName, double orderAmount, double distance) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.orderAmount = orderAmount;
		this.distance = distance;
	}

	public void display() {

		System.out.println("\n===== ORDER SUMMARY =====");
		System.out.println("Customer ID           : " + customerId);
		System.out.println("Customer Name         : " + customerName);
		System.out.println("Restaurant Name       : " + restaurantName);
		System.out.println("Order Amount          : ₹" + orderAmount);
		System.out.println("Delivery Distance     : " + distance + " KM");
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public double getDistance() {
		return distance;
	}
}
