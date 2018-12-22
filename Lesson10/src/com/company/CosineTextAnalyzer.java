package com.company;

import java.util.ArrayList;

public class CosineTextAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider t1, TextProvider t2) {
        ArrayList<String> tokens1 = tokenize(t1.getText());
        ArrayList<String> tokens2 = tokenize(t2.getText());
        ArrayList<String> uniqueWords =
                getUniqueWords(tokens1, tokens2);
        ArrayList<Integer> vector1 = getVector(tokens1, uniqueWords);
        ArrayList<Integer> vector2 = getVector(tokens2, uniqueWords);
        return cos(vector1, vector2);
    }

    private ArrayList<String> tokenize(String text) {
        text = text.replace(",", "").replace(".", "");
        String[] words = text.split(" ");
        ArrayList<String> tokens = new ArrayList<>();
        for (String w : words) {
            w = w.toLowerCase();
            tokens.add(w);
        }
        return tokens;
    }

    private ArrayList<String> getUniqueWords(ArrayList<String> tokens1,
                                             ArrayList<String> tokens2) {
        ArrayList<String> uniqueTokens = new ArrayList<>();
        for (String s : tokens1) {
            if (!uniqueTokens.contains(s)) {
                uniqueTokens.add(s);
            }
        }
        for (String s : tokens2) {
            if (!uniqueTokens.contains(s)) {
                uniqueTokens.add(s);
            }
        }
        return uniqueTokens;
    }

    private ArrayList<Integer> getVector(ArrayList<String> tokens,
                                         ArrayList<String> uniqueWords) {
        ArrayList<Integer> vector = new ArrayList<>();
        for (int i = 0; i < uniqueWords.size(); i++) {
            vector.add(0);
        }
        for (String token : tokens) {
            int index = uniqueWords.indexOf(token);
            vector.set(index, vector.get(index) + 1);
        }
        return vector;
    }

    private double cos(ArrayList<Integer> vector1,
                       ArrayList<Integer> vector2) {
        int sum = 0;
        for (int i = 0; i < vector1.size(); i++) {
            sum += vector1.get(i) * vector2.get(i);
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < vector1.size(); i++) {
            sum1 += vector1.get(i) * vector1.get(i);
            sum2 += vector2.get(i) * vector2.get(i);
        }
        double sqrt1 = Math.sqrt(sum1);
        double sqrt2 = Math.sqrt(sum2);
        return sum / (sqrt1 * sqrt2);
    }











}
