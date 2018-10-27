package com.company;

public class FunctionExample {
    public static void main(String[] args) {
//        int a = sum(10, 3);
//        System.out.println(a);
//        int n = 6;
//        System.out.println(fact(n));
        int[] arr1 = {4, 7, 0};
        int[] arr2 = {3, 1, 5, 4};
        printArray(arr1);
        printArray(arr2);
    }

    //печатает массив на экран
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //ф-ия, считающая факториал числа n
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    //функция, которая возводит число в степень
    static int power(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++) {
            p = p * a;
        }
        return p;
    }

    //функция, считающая сумму двух чисел
    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
}
