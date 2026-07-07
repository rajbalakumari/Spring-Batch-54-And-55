package com.nit;

public class Zomato implements Delivery {

	@Override
	public void display(double orderAmount, double distance) {

		double deliveryCharge = 50 + (7 * distance);
		double totalBill = orderAmount + deliveryCharge;

		System.out.println("Delivery Partner      : Zomato");
		System.out.println("Delivery Charge       : ₹" + deliveryCharge);
		System.out.println("Total Bill Amount     : ₹" + totalBill);
		System.out.println("Estimated Time        : 25-35 Minutes");
	}
}
