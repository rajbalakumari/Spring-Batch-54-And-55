package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("forexExchangeService")
public class ForexExchangeService implements ExchangeRateService {

    public double getRate() {
        return 0.0115;
    }

    public String getProviderName() {
        return "Forex";
    }
}
