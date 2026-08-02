package com.nit.exam4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/exam4/applicationContext.xml");

		Mall mall = context.getBean("mall", Mall.class);

		System.out.println(mall);
	}
}
