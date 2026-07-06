package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InsuranceService {

    @Autowired
    @Qualifier("licProvider")
    private InsuranceProvider provider;

    public void calculatePremium(InsurancePolicy p) {

        if(p.getCustomerName().isEmpty())
            throw new IllegalArgumentException("Invalid Name");

        if(p.getAge()<18 || p.getAge()>60)
            throw new IllegalArgumentException("Invalid Age");

        if(p.getCoverageAmount()<50000)
            throw new IllegalArgumentException("Invalid Coverage");

        double premium=
                p.getCoverageAmount()*provider.getRate();

        double discount=0;

        if(p.getAge()<30)
            discount=premium*0.05;

        System.out.println("Customer Name : "+p.getCustomerName());
        System.out.println("Age : "+p.getAge());
        System.out.println("Coverage Amount : "+p.getCoverageAmount());
        System.out.println("Provider : "+provider.getProviderName());
        System.out.println("Premium Amount : "+premium);
        System.out.println("Discount : "+discount);
        System.out.println("Final Premium : "+(premium-discount));
    }
}
