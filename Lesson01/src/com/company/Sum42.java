package com.company;

/**
 * Вывести сумму чисел от 0 до 42
 */
public class Sum42 {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        while (c <= 42) {
            sum = sum + c;
            c++;//c = c + 1;
        }
        System.out.println(sum);
    }
}
