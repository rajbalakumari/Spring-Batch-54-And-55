package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Hospital;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext  context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hospital h=context.getBean(Hospital.class);
		h.display();
	}

}
