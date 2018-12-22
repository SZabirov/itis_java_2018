package com.company;

import java.util.ArrayList;

public class SerchEngineTestMain {
    public static void main(String[] args) {
        TextProvider t1 = new SimpleTextProvider("мама мыла раму");
        TextProvider t2 = new SimpleTextProvider("Я и мама, и я.");
        TextProvider t3 = new SimpleTextProvider("Я люблю футбол.");
        ArrayList<TextProvider> textProviders = new ArrayList<>();
        textProviders.add(t1);
        textProviders.add(t2);
        textProviders.add(t3);
        TextProvider query = new SimpleTextProvider("Я футбол");

        CosineTextAnalyzer ta = new CosineTextAnalyzer();
        SearchEngine se = new SearchEngine(ta);
        ArrayList<TextProvider> result = se.order(textProviders, query);
    }
}
