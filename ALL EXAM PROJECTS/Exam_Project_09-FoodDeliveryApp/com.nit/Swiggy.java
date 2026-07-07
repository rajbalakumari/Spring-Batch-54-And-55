package com.nit;

public class Swiggy implements Delivery {

	@Override
	public void display(double orderAmount, double distance) {

		double deliveryCharge = 40 + (8 * distance);
		double totalBill = orderAmount + deliveryCharge;

		System.out.println("Delivery Partner      : Swiggy");
		System.out.println("Delivery Charge       : ₹" + deliveryCharge);
		System.out.println("Total Bill Amount     : ₹" + totalBill);
		System.out.println("Estimated Time        : 30-40 Minutes");
	}
}
