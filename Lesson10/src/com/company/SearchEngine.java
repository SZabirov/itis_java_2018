package com.company;

import java.util.ArrayList;

public class SearchEngine {
    TextAnalyzer analyzer;

    public SearchEngine(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public void order (ArrayList<TextProvider> sources,
                                          TextProvider searchQuery) {
        int n = sources.size();
        for (int i = 0; i < sources.size(); i++) {
            int indexOfMin = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                double coef1 = analyzer.analyze(sources.get(indexOfMin), searchQuery);
                double coef2 = analyzer.analyze(sources.get(j), searchQuery);
                if (coef2 < coef1) {
                    indexOfMin = j;
                }
            }
            TextProvider p1 = sources.get(indexOfMin);
            sources.set(indexOfMin, sources.get(n - 1 - i));
            sources.set(n - 1 - i, p1);
        }
    }
}
