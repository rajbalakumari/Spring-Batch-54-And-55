package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("licProvider")
public class LICProvider implements InsuranceProvider {

    public double getRate() {
        return 0.015;
    }

    public String getProviderName() {
        return "LIC";
    }
}
