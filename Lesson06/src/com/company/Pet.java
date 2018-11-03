package com.company;

public class Pet {
    String name;//поле класса
    int age;
    String color;
    int height;
    int energy;

    Pet(String name, int height, int energy) {
        this.name = name;
        this.height = height;
        this.energy = energy;
    }

    //метод (любая функция или процедура)
    void fight() {
        energy -= 10;
        height -= 1;
    }

    void sayHello() {
        System.out.println("Привет! Я - " + name);
    }

    void eat(String food) {
        System.out.printf("Ом-ном-ном, %s закончился", food);
    }
}
