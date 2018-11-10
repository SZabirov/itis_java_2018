package com.company;

public class Product {
    int id;
    String name;
    int count;
    int cost;

    public Product(String name, int count, int cost) {
        this.name = name;
        this.count = count;
        this.cost = cost;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", cost=" + cost +
                '}';
    }
}
