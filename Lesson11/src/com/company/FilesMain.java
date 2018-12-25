package com.company;

import java.io.File;

public class FilesMain {
    public static void main(String[] args) {
        File folder =
                new File("/home/salavat/projects/itis/sc");
        printAllFileNames(folder);
    }

    static void printAllFileNames(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();//возвращает все файлы в данном каталоге
            for (File file : files) {
                if (file.isDirectory()) {
                    printAllFileNames(file);
                } else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
