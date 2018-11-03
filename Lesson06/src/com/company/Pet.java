package com.company;

public class Pet {
    int[] m = {1, 4};
    private String name;//поле класса
    private int age;
    String color;
    int height;
    int energy;

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException(age + " - некорректное значение возраста");
        }
    }

    Pet(String name, int height, int energy) {
        this.name = name;
        this.height = height;
        this.energy = energy;
    }

    Pet(String name, int age, String color, int height, int energy) {
        this.name = name;
        this.age = age;
        this.color = color;
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
        energy += 10;
    }
}
