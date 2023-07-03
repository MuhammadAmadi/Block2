package org.example;
//Задание 1.
//Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 1000.
//Создайте метод, в который передается заполненный выше массив и с помощью Set вычислите процент уникальных значений
//в данном массиве и верните его в виде числа с плавающей запятой.

import java.util.*;

//Для вычисления процента используйте формулу:
//Процент уникальных чисел=количество уникальных чисел*100/общее количество чисел в массиве.
public class test1 {
    public static void main(String[] args) {
        int[] test = createRandArr();
//        System.out.println(Arrays.toString(test));
        System.out.println(uniqueNum(test)+" %");
    }

    public static int[] createRandArr(){
        return createRandArr(1000,1000);
    }
    public static int[] createRandArr(int length, int bound){
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(bound);
        }

        return arr;
    }

    public static double uniqueNum(int[] arr){
        Set<Integer> set = new HashSet<Integer>();
        for (int i : arr) {
            set.add(i);
        }

        return (double) set.size() * 100 / arr.length;
    }
}