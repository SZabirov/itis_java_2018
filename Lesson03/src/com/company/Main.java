package com.company;

//отсортировать элементы массива по возрастанию
public class Main {
    public static void main(String[] args) {
	    int[] arr = {4, 2, 5, 3, 1};//короткий способ объявить массив сразу со значениями
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            int b = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
