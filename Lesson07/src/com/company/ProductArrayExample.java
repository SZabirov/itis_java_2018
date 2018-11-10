package com.company;

public class ProductArrayExample {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Product p1 = new Product("батон", 1, 25);
        Product p2 = new Product("коржик", 5, 15);
        products[0] = p1;
        products[1] = p2;
        products[2] = new Product("халва", 2, 45);
        System.out.println(products[0].cost +
                products[1].cost);
    }
}
