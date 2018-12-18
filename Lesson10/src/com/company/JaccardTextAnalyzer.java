package com.company;

import java.util.ArrayList;
import java.util.List;

public class JaccardTextAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider t1, TextProvider t2) {
        String text1 = t1.getText();
        String text2 = t2.getText();
        ArrayList<String> tokens1  = tokenize(text1);
        ArrayList<String> tokens2  = tokenize(text2);
        return jaccardSimilarity(tokens1, tokens2);
    }

    //вернет список слов в нижнем регистре без повторений
    private ArrayList<String> tokenize(String text) {
        text = text.replace(",", "").replace(".", "");
        String[] words = text.split(" ");
        ArrayList<String> tokens = new ArrayList<>();
        for (String w : words) {
            w = w.toLowerCase();
            if (!tokens.contains(w)) {
                tokens.add(w);
            }
        }
        return tokens;
    }

    private double jaccardSimilarity(ArrayList<String> tokens1,
                                     ArrayList<String> tokens2){
        int countOfSameWords = 0;
        for (String t : tokens1) {
            if (tokens2.contains(t)) {
                countOfSameWords++;
            }
        }
        int n1 = tokens1.size();
        int n2 = tokens2.size();
        return (double) countOfSameWords /
                (n1 + n2 - countOfSameWords);
    }
}
