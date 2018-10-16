package com.company;

import java.util.Scanner;

/**
 * Произведение чисел от 1 до того числа, которое ввел пользователь
 */
public class MultToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int mult = 1;
        while (c <= n) {
            mult = mult * c;
            c++;
        }
        System.out.println(mult);
    }
}
