package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DocumentTranslationService {

    @Autowired
    @Qualifier("googleTranslator")
    private TranslationService service;

    public void translate(Document d) {

        if(d.getDocumentName().isEmpty())
            throw new IllegalArgumentException("Document name cannot be empty");

        if(d.getSourceLanguage().equalsIgnoreCase(d.getTargetLanguage()))
            throw new IllegalArgumentException("Languages cannot be same");

        if(d.getWordCount()<=0)
            throw new IllegalArgumentException("Word count must be > 0");

        double cost=d.getWordCount()*service.getCostPerWord();
        double discount=0;

        if(d.getWordCount()>5000)
            discount=cost*0.10;

        System.out.println("Document Name : "+d.getDocumentName());
        System.out.println("Word Count : "+d.getWordCount());
        System.out.println("Translator : "+service.getTranslatorName());
        System.out.println("Translation Cost : "+cost);
        System.out.println("Discount : "+discount);
        System.out.println("Final Cost : "+(cost-discount));
        System.out.println("Translation Completed Successfully");
    }
}
