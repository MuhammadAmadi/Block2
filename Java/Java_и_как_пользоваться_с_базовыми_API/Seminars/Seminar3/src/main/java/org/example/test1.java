package org.example;

//Заполнить список десятью разными числами.
//Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listIntegers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            listIntegers.add(random.nextInt(100));
        }
        System.out.println(listIntegers);
        listIntegers.sort(Comparator.naturalOrder());
        System.out.println(listIntegers);
    }
}