package com.nit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Policy Number : ");
		String policyNo = sc.nextLine();

		System.out.print("Enter Customer Name : ");
		String customerName = sc.nextLine();

		System.out.print("Enter Vehicle Number : ");
		String vehicleNo = sc.nextLine();

		System.out.print("Enter Vehicle Model : ");
		String model = sc.nextLine();

		System.out.print("Enter Manufacturing Year : ");
		int year = sc.nextInt();
		sc.nextLine();

		System.out.println("\nPolicy Types");
		System.out.println("car");
		System.out.println("bike");
		System.out.println("commercial");

		System.out.print("Enter Policy Type : ");
		String type = sc.nextLine();

		Insurance insurance = InsuranceFactory.getInsurance(type);

		if (insurance == null) {
			System.out.println("Invalid Policy Type");
			return;
		}

		System.out.println("\n===== POLICY DETAILS =====");

		System.out.println("Policy Number         : " + policyNo);
		System.out.println("Customer Name         : " + customerName);
		System.out.println("Vehicle Number        : " + vehicleNo);
		System.out.println("Vehicle Model         : " + model);
		System.out.println("Manufacturing Year    : " + year);

		insurance.display();

		System.out.println("Policy Status         : Active");

		sc.close();
	}
}
