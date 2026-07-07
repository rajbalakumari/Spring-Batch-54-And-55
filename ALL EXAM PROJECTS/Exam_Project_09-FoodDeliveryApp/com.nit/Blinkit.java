package com.nit;

public class Blinkit implements Delivery {

	@Override
	public void display(double orderAmount, double distance) {

		double deliveryCharge = 30 + (10 * distance);
		double totalBill = orderAmount + deliveryCharge;

		System.out.println("Delivery Partner      : Blinkit");
		System.out.println("Delivery Charge       : ₹" + deliveryCharge);
		System.out.println("Total Bill Amount     : ₹" + totalBill);
		System.out.println("Estimated Time        : 15-20 Minutes");
	}
}
