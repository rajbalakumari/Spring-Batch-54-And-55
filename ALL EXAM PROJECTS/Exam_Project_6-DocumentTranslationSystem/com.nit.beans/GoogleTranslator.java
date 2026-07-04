package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("googleTranslator")
public class GoogleTranslator implements TranslationService {

    public double getCostPerWord() {
        return 0.50;
    }

    public String getTranslatorName() {
        return "Google";
    }
}
