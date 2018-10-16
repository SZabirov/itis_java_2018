package com.company;

/**
 * Вывести на экран произведение чисел от 1 до 10
 * Сделать с пом. цикла.
 */
public class Mult10 {
    public static void main(String[] args) {
        int c = 1;
        int mult = 1;
        while (c <= 10) {
            mult = mult * c;
            c++;
        }
        System.out.println(mult);
    }
}
