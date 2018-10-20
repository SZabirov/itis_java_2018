package com.company;

/**
 * Created by User on 20.10.2018.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int x = 10;
        int[] arr = new int[5];//объявление массива на 5 элементов
        arr[0] = 42;//в нулевую ячейку записали число 42
        arr[1] = 36;
        arr[2] = 7;
        arr[3] = arr[1] + 5;
        arr[4] = arr[2];
        int k = 0;
        while(k < 5) {
            System.out.println(arr[k]);
            k++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
