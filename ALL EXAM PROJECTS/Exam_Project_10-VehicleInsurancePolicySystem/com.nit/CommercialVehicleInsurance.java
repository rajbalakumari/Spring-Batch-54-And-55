package com.nit;

public class CommercialVehicleInsurance implements Insurance {

	@Override
	public void display() {

		System.out.println("Insurance Type : Commercial Vehicle Insurance");
		System.out.println("Premium Amount : ₹15000");
		System.out.println("Coverage Amount : ₹1000000");
		System.out.println("Policy Validity : 1 Year");
	}
}
