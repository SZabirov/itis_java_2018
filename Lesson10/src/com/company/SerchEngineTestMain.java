package com.company;

import com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator;

import java.util.ArrayList;

public class SerchEngineTestMain {
    public static void main(String[] args) {
        TextProvider t1 = new SimpleTextProvider("мама мыла раму");
        TextProvider t2 = new SimpleTextProvider("Я и мама, и я.");
        TextProvider t3 = new SimpleTextProvider("Я люблю футбол.");
        ArrayList<TextProvider> sources = new ArrayList<>();
        sources.add(t1);
        sources.add(t2);
        sources.add(t3);
        TextProvider query = new SimpleTextProvider("Я футбол");

        CosineTextAnalyzer ta = new CosineTextAnalyzer();
        SearchEngine se = new SearchEngine(ta);
        se.order(sources, query);
        for (TextProvider p : sources) {
            System.out.println(p.getText());
        }
    }
}
