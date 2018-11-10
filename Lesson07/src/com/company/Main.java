package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Product p = new Product();
//        p.name = sc.next();
//        p.count = sc.nextInt();
//        p.cost = sc.nextInt();
//        s.add(p);
        Storage s = new Storage();

        Product[] allProds = s.getAllProducts();
        System.out.println(Arrays.toString(allProds));

        Product product = s.getById(1);
        System.out.println(product);
    }
}










