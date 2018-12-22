package com.company.humans;

public class Human {
    private int weight = 100;

    public void eat() {
        weight++;
        System.out.println("Немного потолстел)))");
    }

    public int getWeight() {
        return this.weight;
    }
}
