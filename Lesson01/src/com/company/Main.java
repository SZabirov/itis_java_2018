package com.company;

import java.util.Scanner;

/**
 * Пользователь вводит, сколько км он проедет,
 * программа вываодит стоимость поездки
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite km:");
        int s = sc.nextInt();
        double cost = s * 25;
        if (cost > 200) {
            cost = cost * 0.95;
        }
        System.out.println("Stoimost: " + cost);
    }
}
