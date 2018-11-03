package com.company;

public class Main {

    public static void main(String[] args) {
        Pet zhuchka = new Pet("Жучка", 40, 100);//создание объекта класса Pet
        zhuchka.setAge(10);
        zhuchka.setAge(-1);
        zhuchka.sayHello();
        zhuchka.fight();
        System.out.println(zhuchka.energy);
        zhuchka.eat("lkj");
        Pet c = new Pet("Борис", 2, "серый", 30, 9000);
        c.eat("KitiKat");
    }
}
