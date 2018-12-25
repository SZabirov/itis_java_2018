package com.company;

public class MainCalculator {
    public static void main(String[] args) {
        //Calculator.fact(); - ошибка
        Calculator c = new Calculator();
        int x = c.fact(5);

        RecursionMain.fact(5);
    }
}
