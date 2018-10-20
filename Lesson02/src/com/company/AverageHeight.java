package com.company;

import java.util.Scanner;

/**
 * Есть класс, в нем n учеников. Пользователь вводит n
 * Затем по очереди вводит рост (в см) каждого ученика.
 * 1) Вывести средний рост в классе.
 * 2) Вывести количество учеников, чей рост выше среднего.
 */
public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во учеников:");
        int n = sc.nextInt();
        int[] students = new int[n];
        System.out.println("Вводите рост учеников:");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + students[i];
        }
        double averageHeight = ((double) sum) / n;
        System.out.println("Средний рост: " + averageHeight);
    }
}
