package com.nit;

public class BikeInsurance implements Insurance {

	@Override
	public void display() {

		System.out.println("Insurance Type  : Bike Insurance");
		System.out.println("Premium Amount  : ₹2500");
		System.out.println("Coverage Amount : ₹200000");
		System.out.println("Policy Validity : 1 Year");
	}
}
