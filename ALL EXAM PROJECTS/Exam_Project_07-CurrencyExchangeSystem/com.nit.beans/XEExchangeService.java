package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("xeExchangeService")
public class XEExchangeService implements ExchangeRateService {

    public double getRate() {
        return 0.012;
    }

    public String getProviderName() {
        return "XE";
    }
}
