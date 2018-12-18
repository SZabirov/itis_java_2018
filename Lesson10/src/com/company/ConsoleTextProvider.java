package com.company;

import java.util.Scanner;

public class ConsoleTextProvider implements TextProvider {
    @Override
    public String getText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите текст для анализа");
        String text = sc.nextLine();
        return text;
    }
}
