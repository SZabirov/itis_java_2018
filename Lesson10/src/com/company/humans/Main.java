package com.company.humans;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();

        SuperMan s = new SuperMan();
        s.programming();
        s.programming();
        s.programming();
        s.eat();

        Human simpleHuman = new SuperMan();
        SuperMan sm = (SuperMan) simpleHuman;
        sm.programming();

        FiveStarHotel hotel = new FiveStarHotel();
        hotel.live(h);
        hotel.live(sm);
    }
}
