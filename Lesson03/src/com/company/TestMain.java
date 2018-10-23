package com.company;

public class TestMain {
    public static void main(String[] args) {
        String s = "abcd";
        int l = s.length();
        System.out.println(l);
        String[] arr = {"Petya", "Tom", "John"};
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            for (int i = 0; i < n - j; i++) {
                if (arr[i].length() > arr[indexOfMax].length()) {
                    indexOfMax = i;
                }
            }
            String b = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
