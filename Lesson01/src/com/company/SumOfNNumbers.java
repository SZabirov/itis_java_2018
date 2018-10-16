package com.company;

import java.util.Scanner;

/**
 * Пользователь вводит число n, затем n целых чисел.
 * Посчитать сумму n чисел.
 */
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введит кол-во чисел:");
        int n = sc.nextInt();
        int c = 0;
        int sum = 0;
        System.out.println("Вводите числа по одному:");
        while (c < n) {
            int x = sc.nextInt();
            sum = sum + x;
            c++;
        }
        System.out.println(sum);
    }
}
