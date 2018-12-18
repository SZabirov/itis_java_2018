package com.company;

public interface TextAnalyzer {
    //возвращает коэффициент схожести
    //принимает два экземпляра TextProvider,
    //которые дают тексты для анализа
    double analyze(TextProvider t1, TextProvider t2);
}
