package com.company;

public class Main {

    public static void main(String[] args) {
        Pet zhuchka = new Pet("sdfa", 40, 100);//создание объекта класса Pet
        zhuchka.sayHello();
        zhuchka.fight();
        System.out.println(zhuchka.energy);
        zhuchka.eat("lkj");
//        Pet c = new Pet();
//        c.name = "Барсик";
//        c.color = "Белый";
//        c.eat("Хлеб");
    }
}
