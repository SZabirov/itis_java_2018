package com.company;

import java.util.Scanner;

/**
 * Пользователь вводит число n, затем n целых положительные чисел.
 * Вывести максимальное из них
 */
public class MaxOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введит кол-во чисел:");
        int n = sc.nextInt();
        int c = 0;
        if (n > 0) {
            int max = sc.nextInt();
            System.out.println("Вводите числа по одному:");
            while (c < n - 1) {
                int x = sc.nextInt();
                if (x > max) {
                    max = x;
                }
                c++;
            }
            System.out.println(max);
        } else {
            System.out.println("Нет чисел - нет максимума");
        }
    }
}
