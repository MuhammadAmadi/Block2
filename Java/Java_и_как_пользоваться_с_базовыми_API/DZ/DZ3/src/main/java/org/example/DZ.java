package org.example;
//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DZ {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        findRandList(listInt, 10);
        System.out.println(listInt);
        System.out.println("Min " + minMaxValue(listInt));
        System.out.println("Max " + minMaxValue(listInt, false));
        System.out.println("Среднее значение " + averageValue(listInt));
        removeEven(listInt);
        System.out.println(listInt);
    }

    public static void findRandList(List<Integer> arrList, int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrList.add(random.nextInt(100 + size*2));
        }
    }

    public static int minMaxValue(List<Integer> arrList){
        return minMaxValue(arrList, true);
    }

    public static int minMaxValue(List<Integer> arrList, boolean min){

        int value = arrList.get(0), max = value;
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) < value) value = arrList.get(i);
            else if (arrList.get(i) > max) max = arrList.get(i);
        }
        if (!min) value = max;
        return value;
    }

    public static double averageValue(List<Integer> arrList){
        double sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum += arrList.get(i);
        }
        return (double) Math.round((sum / arrList.size()) * 100) / 100;
    }

    public static void removeEven(List<Integer> arrList){
        int i = 0;
        while (i < arrList.size()){
            if(arrList.get(i) % 2 == 0){
                arrList.remove(i);
                i--;
            }
            i++;
        }
    }

}