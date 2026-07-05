package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.CurrencyConverterService;
import com.nit.beans.CurrencyTransaction;
import com.nit.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfig.class);

        CurrencyConverterService service=
                ctx.getBean(CurrencyConverterService.class);

        CurrencyTransaction ct=
                new CurrencyTransaction(1,"Rahman","INR","USD",1000);

        service.convert(ct);

        ctx.close();
    }
}
