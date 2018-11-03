package com.company.pole;

import java.util.Arrays;

public class PoleMuseum {
    private String[] gifts;
    int counter;

    PoleMuseum(int maxNum) {
        gifts = new String[maxNum];
        counter = 0;
    }

    void addGift(String gift) {
        if (counter == gifts.length) {
            grow();
        }
        gifts[counter] = gift;
        counter++;
    }

    /**
     * Заменяет существующий массив на другой массив,
     * длины в два раза большей. Все элементы копируются
     * из старого в новый.
     */
    private void grow() {
        String[] newGifts = new String[2 * gifts.length];
        for (int i = 0; i < gifts.length; i++) {
            newGifts[i] = gifts[i];
        }
        gifts = newGifts;
    }

    @Override
    public String toString() {
        return "PoleMuseum{" +
                "gifts=" + Arrays.toString(gifts) +
                ", counter=" + counter +
                '}';
    }
}
