package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("iciciProvider")
public class ICICIProvider implements InsuranceProvider {

    public double getRate() {
        return 0.02;
    }

    public String getProviderName() {
        return "ICICI";
    }
}
