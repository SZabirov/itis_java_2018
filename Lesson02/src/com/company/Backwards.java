package com.company;

import java.util.Scanner;

/**
 * Пользователь вводит число n, затем n чисел.
 * Вывести все числа в обратном порядке.
 * 5
 * 1 3 7 9 0
 * 0 9 7 3 1
 */
public class Backwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите кол-во чисел:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("вводите числа по одному");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
