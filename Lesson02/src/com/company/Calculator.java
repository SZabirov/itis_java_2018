package com.company;

import java.util.Scanner;

/**
 * Калькулятор 1.
 * Получить от пользователя 2 числа и + - * /,
 * вывести ответ, получившийся в результате
 * применения выбранного оператора к введенным
 * двум числам
 * 2
 * +
 * 5
 * Ответ: 7
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = sc.nextInt();
        System.out.println("Введите оператор");
        String op = sc.next();
        System.out.println("Введите второе число");
        double b = sc.nextInt();
        double result = 0;
        if (op.equals("+")) {
            result = a + b;
        }
        if (op.equals("-")) {
            result = a - b;
        }
        if (op.equals("*")) {
            result = a * b;
        }
        if (op.equals("/")) {
            result = a / b;
        }
        System.out.println("Ответ: " + result);
    }
}
