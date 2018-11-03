package com.company.pole;

public class Game {
    public static void main(String[] args) {
        PoleMuseum p = new PoleMuseum(3);
        p.addGift("Матрешка");
        p.addGift("Сковорода");
        p.addGift("Сковорода");
        p.addGift("Сковорода");
        System.out.println(p);
        Cylinder c = new Cylinder();
        c.roll();
        System.out.println(c.getSector());
        c.roll();
        System.out.println(c.getSector());
    }
}
