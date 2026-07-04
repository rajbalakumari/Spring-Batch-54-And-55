package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("microsoftTranslator")
public class MicrosoftTranslator implements TranslationService {

    public double getCostPerWord() {
        return 0.45;
    }

    public String getTranslatorName() {
        return "Microsoft";
    }
}
