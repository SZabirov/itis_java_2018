package com.company;

import java.io.File;

public class RecursionMain {

    public static void main(String[] args) {
        printNTo1(10);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            int f = n * fact(n - 1);
            return f;
        }
    }

    static int sumN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumN(n - 1);
        }
    }

    static void printNTo1(int n) {
        if (n > 0) {
            System.out.println(n);
            printNTo1(n - 1);
        }
    }

    static void print1ToN(int n) {
        if (n > 0) {
            print1ToN(n - 1);
            System.out.println(n);
        }
    }

    static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }







}
