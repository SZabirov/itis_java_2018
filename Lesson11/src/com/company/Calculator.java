package com.company;

public class Calculator {
    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            int f = n * fact(n - 1);
            return f;
        }
    }
}
