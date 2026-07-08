package com.nit;

public class CarInsurance implements Insurance {

	@Override
	public void display() {

		System.out.println("Insurance Type : Car Insurance");
		System.out.println("Premium Amount : ₹8000");
		System.out.println("Coverage Amount  : ₹500000");
		System.out.println("Policy Validity : 1 Year");
	}
}
