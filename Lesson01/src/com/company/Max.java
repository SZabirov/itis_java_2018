package com.company;

import java.util.Scanner;

/**
 * Пользователь вводит 3 числа.
 * Вывести наибольшее из них
 */
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b > a) {
            if (c > b) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
    }
}


