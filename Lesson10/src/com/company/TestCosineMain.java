package com.company;

import java.io.File;

public class TestCosineMain {
    public static void main(String[] args) {
        File f  = new File("myReferat.txt");
        TextProvider fileProvider = new FileTextProvider(f);
        System.out.println(fileProvider.getText());

        TextProvider simpleProvider =
                new SimpleTextProvider("я люблю футбол");
        System.out.println(simpleProvider.getText());

        TextAnalyzer te = new CosineTextAnalyzer();
        double coef = te.analyze(fileProvider, simpleProvider);
        System.out.println(coef);
    }
}
