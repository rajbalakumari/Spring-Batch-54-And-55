package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.BookIssue;
import com.nit.beans.College;
import com.nit.beans.Library;
import com.nit.beans.Order;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("========== TASK 1 ==========");

		College c1 = context.getBean(College.class);
		College c2 = context.getBean(College.class);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println("Principal HashCode 1 : " + c1.getPrincipal().hashCode());

		System.out.println("Principal HashCode 2 : " + c2.getPrincipal().hashCode());

		System.out.println("\n========== TASK 2 ==========");

		Order o1 = context.getBean(Order.class);
		Order o2 = context.getBean(Order.class);

		System.out.println(o1);
		System.out.println(o2);

		System.out.println("Order HashCode 1 : " + o1.hashCode());
		System.out.println("Order HashCode 2 : " + o2.hashCode());

		System.out.println("\n========== TASK 3 ==========");

		Library l1 = context.getBean(Library.class);
		Library l2 = context.getBean(Library.class);

		BookIssue b1 = context.getBean(BookIssue.class);
		BookIssue b2 = context.getBean(BookIssue.class);

		System.out.println(l1);
		System.out.println(l2);

		System.out.println("Library HashCode 1 : " + l1.hashCode());

		System.out.println("Library HashCode 2 : " + l2.hashCode());

		System.out.println(b1);
		System.out.println(b2);

		System.out.println("BookIssue HashCode 1 : " + b1.hashCode());

		System.out.println("BookIssue HashCode 2 : " + b2.hashCode());
	}
}
