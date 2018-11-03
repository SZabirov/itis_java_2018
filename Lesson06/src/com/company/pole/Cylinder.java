package com.company.pole;

import java.util.Random;

public class Cylinder {
    private String[] sectors = {"100", "250", "500",
            "750", "0", "банкрот", "+"};
    private int pointer;

    void roll() {
        Random r = new Random();
        pointer = r.nextInt(sectors.length);
    }

    String getSector() {
        return sectors[pointer];
    }
}
