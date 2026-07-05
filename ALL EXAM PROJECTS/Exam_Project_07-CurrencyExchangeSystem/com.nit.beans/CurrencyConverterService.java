package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CurrencyConverterService {

    @Autowired
    @Qualifier("rbiExchangeService")
    private ExchangeRateService service;

    public void convert(CurrencyTransaction ct) {

        double result=ct.getAmount()*service.getRate();

        System.out.println("Conversion Successful");
        System.out.println("Provider : "+service.getProviderName());
        System.out.println("Converted Amount : "+result+" USD");
        System.out.println("Status : Success");
    }
}
