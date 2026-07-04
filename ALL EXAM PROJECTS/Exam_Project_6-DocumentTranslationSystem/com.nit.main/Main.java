package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Document;
import com.nit.beans.DocumentTranslationService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		DocumentTranslationService service = ctx.getBean(DocumentTranslationService.class);

		Document d = new Document(101, "ProjectReport", "English", "French", 6000);

		service.translate(d);

		ctx.close();
	}
}
