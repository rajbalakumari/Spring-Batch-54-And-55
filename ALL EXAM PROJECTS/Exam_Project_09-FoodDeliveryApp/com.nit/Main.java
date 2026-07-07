package com.nit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Customer Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Restaurant Name : ");
		String restaurant = sc.nextLine();

		System.out.print("Enter Order Amount : ");
		double amount = sc.nextDouble();

		System.out.print("Enter Delivery Distance(KM) : ");
		double distance = sc.nextDouble();

		Customer customer = new Customer(id, name, restaurant, amount, distance);

		System.out.println("\nChoose Delivery Partner");
		System.out.println("1. Swiggy");
		System.out.println("2. Zomato");
		System.out.println("3. Blinkit");

		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();

		Delivery delivery = null;

		switch (choice) {

		case 1:
			delivery = new Swiggy();
			break;

		case 2:
			delivery = new Zomato();
			break;

		case 3:
			delivery = new Blinkit();
			break;

		default:
			System.out.println("Invalid Choice");
			System.exit(0);
		}

		customer.display();
		delivery.display(customer.getOrderAmount(), customer.getDistance());

		System.out.println("Order Status          : Confirmed");

		sc.close();
	}
}
