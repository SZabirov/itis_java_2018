package com.company;

import java.util.ArrayList;

public class SearchEngine {
    TextAnalyzer analyzer;

    public SearchEngine(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public ArrayList<TextProvider> order (
            ArrayList<TextProvider> sources,
            TextProvider searchQuery
    ) {
        for (TextProvider tp : sources) {
            double coef = analyzer.analyze(tp, searchQuery);
        }
        return sources;
    }
}
