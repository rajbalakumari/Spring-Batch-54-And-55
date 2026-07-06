package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("hdfcProvider")
public class HDFCProvider implements InsuranceProvider {

    public double getRate() {
        return 0.018;
    }

    public String getProviderName() {
        return "HDFC";
    }
}
