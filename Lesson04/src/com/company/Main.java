package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Посчитать общую стоимость всей продукции в магазине
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
	    File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        int sum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] elems = s.split(" ");
            int price = Integer.parseInt(elems[1]);
            int num = Integer.parseInt(elems[2]);
            sum += price * num;
        }
        System.out.println("General cost: " + sum);

        boolean a = exists("хлеб");
        System.out.println(a);
    }

    /**
     * Возвращает true, если имеется в файле запись
     * о таком продукте и его кол-во больше нуля
     * @param productName имя продукта
     */
    static boolean exists(String productName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("products.txt"));
        boolean productExists = false;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] elems = s.split(" ");
            if (elems[0].equals(productName)) {
                int count = Integer.parseInt(elems[2]);
                if (count > 0) {
                    productExists = true;
                }
            }
        }
        return productExists;
    }

    /**
     * Функция, которая возвращает стоимость продукта по его имени.
     * Если такого продукта нет, то вернуть -1
     */
    static int getCost(String productName) {
        //todo реализовать данную функцию
        return 0;
    }

}
