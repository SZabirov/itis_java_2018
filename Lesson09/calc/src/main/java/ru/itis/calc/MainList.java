package ru.itis.calc;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        String[] names = new String[100];
        names[0] = "Петров";
        names[1] = "Иванов";
        //...
        names[99] = "Забиров";
        String[] newNames = new String[200];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        names = newNames;
    }
}

class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Петров");//добавление
        list.add("Иванов");
        list.remove(0);//удаляет элемент с данным индексом
        String n = list.get(0);//получение из списка элемента с индексом 0
        int x = 6;
        Integer a = 5;
        int r = a;
        ArrayList<Integer> intList = new ArrayList<>();//создание списка целых чисел
        intList.add(5);
        intList.add(42);
        List<Integer> l = new ArrayList<>();
        System.out.println(intList);
    }
}






