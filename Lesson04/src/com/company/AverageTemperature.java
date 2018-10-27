package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Посчитать среднюю температуру за неделю
 * по данным из weather.txt
 */
public class AverageTemperature {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("weather.txt");
        Scanner sc = new Scanner(f);
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            String s1 = sc.nextLine();
            String[] elems1 = s1.split(" ");//разбивает строку по разделителю
            String temp1 = elems1[1];//"6"
            int t1 = Integer.parseInt(temp1);//получение числа, записанного в строке
            sum += t1;//то же, что sum = sum + t1;
        }
        System.out.println(sum / 7);
    }
}
