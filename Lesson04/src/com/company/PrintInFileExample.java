package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Написать код, который попарно сложит
 * числа из in1.txt и in2.txt, а результат
 * запишет в out.txt. Для чисел в in1.txt и in2.txt
 * Ответ в out.txt записался бы такой:
 * 6
 * 12
 * 15
 */
public class PrintInFileExample {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("out.txt");
        PrintWriter pw = new PrintWriter(f);
        pw.println("Hello");
        pw.println("Petya");
        pw.close();
    }
}
