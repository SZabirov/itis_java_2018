package com.company.matrix;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int c = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = c++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (i == j) {
//                    sum += arr[i][j];
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i][arr.length - i - 1];
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
