package com.company;

import java.io.*;
import java.util.Scanner;

public class Storage {
    void add(Product p) throws IOException {
        File f = new File("products.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        int id = size() + 1;
        pw.println(id + " " + p.name + " " + p.count + " " + p.cost);
        pw.close();
    }

    //По возрастанию цены
    Product[] getAllProductsOrderedByCost() {
        return null;
    }

    //заменяет информацию о продукте с таким же айдишником
    //новыми значениями из p
    void setProduct(Product p) {

    }

    //вернуть все продукты из файла в виде массива Product'ов
    Product[] getAllProducts() throws FileNotFoundException {
        int n = size();
        Product[] products = new Product[n];
        Scanner sc = new Scanner(new File("products.txt"));
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            products[i] = getProductFromString(s);
        }
        return products;
    }

    //вернуть продукт с данным id
    Product getById(int id) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("products.txt"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Product p = getProductFromString(s);
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    Product getProductFromString(String s) {
        String[] arr = s.split(" ");
        Product p = new Product();
        p.id = Integer.parseInt(arr[0]);
        p.name = arr[1];
        p.count = Integer.parseInt(arr[2]);
        p.cost = Integer.parseInt(arr[3]);
        return p;
    }

    private int size() throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        int n = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            n++;
        }
        return n;
    }
}






