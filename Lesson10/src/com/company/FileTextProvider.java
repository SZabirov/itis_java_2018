package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
    private File inputFile;

    public FileTextProvider(File file) {
        this.inputFile = file;
    }

    @Override
    public String getText() {
        String text = "";
        try {
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                text += sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("всё оч плохо:((");
        }
        return text;
    }
}
