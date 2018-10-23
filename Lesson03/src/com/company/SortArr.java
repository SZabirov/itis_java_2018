package com.company;

public class SortArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 4};
        int[] arr2 = {0, 3, 5, 2};
        int[] arr3 = {1, 3, 4, 2, 4, 6, 9};
        sort(arr1);
        sort(arr2);
        sort(arr3);

        String[] strs = {"abc", "cdef", "qwerty", "ui"};
        String s = getLongestWord(strs);
    }
    //функция, которая вернет самое длинное из массива строк
    static String getLongestWord(String[] words) {
        return "";//доделать
    }
    //процедура, сортирующая массив целых чисел по возрастанию
    static void sort(int[] arr) {
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
    }
}
