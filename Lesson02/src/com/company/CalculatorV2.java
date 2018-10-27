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
 * Снова спрашивает:
 * Введите первое число
 * оператор...
 * второе число...
 * Ответ...
 * Салават Забиров
 */
public class CalculatorV2 {
    public static void main(String[] args) {
        boolean reset = true;//true, если нужно сбросить результат
        Scanner sc = new Scanner(System.in);
        double a = 0;//первый аргумент
        double b = 0;//второй аргумент
        while (true) {
            if (reset) {//если пользователь решил сбросить, то получаем новое первое число
                System.out.println("Введите первое число");
                a = sc.nextInt();
            }
            System.out.println("Введите оператор");
            String op = sc.next();
            System.out.println("Введите второе число");
            b = sc.nextInt();
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
            System.out.println("Сбросить результат? y - да, n - нет");
            String answer = sc.next();
            if (answer.equals("y")) {
                reset = true;
            } else {
                reset = false;
                a = result;//если не сбрасываем результат, то ответ служит первым аргументом для следующего вычисления
            }
        }
    }
}
