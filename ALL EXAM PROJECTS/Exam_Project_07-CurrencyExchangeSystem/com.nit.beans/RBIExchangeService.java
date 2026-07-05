package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("rbiExchangeService")
public class RBIExchangeService implements ExchangeRateService {

    public double getRate() {
        return 0.01175;
    }

    public String getProviderName() {
        return "RBI";
    }
}
