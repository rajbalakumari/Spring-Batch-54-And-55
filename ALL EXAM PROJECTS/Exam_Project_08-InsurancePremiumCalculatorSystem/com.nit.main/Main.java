package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.InsurancePolicy;
import com.nit.beans.InsuranceService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		InsuranceService service = ctx.getBean(InsuranceService.class);

		InsurancePolicy p = new InsurancePolicy(101, "Rajat", 25, "Life", 1000000);

		service.calculatePremium(p);

		ctx.close();
	}
}
