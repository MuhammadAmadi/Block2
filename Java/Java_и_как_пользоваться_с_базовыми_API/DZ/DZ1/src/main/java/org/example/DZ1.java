package org.example;

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Random;

public class DZ1 {
    public static void main(String[] args) {
        int[] myArr = createArrRand(100,-10,10);
        for (int i: myArr){
            System.out.print(i + " ");
        }
    }

    public static int [] createArrRand(int length, int minVal, int maxVal ){
        int [] myArr = new int[length];
        Random r = new Random();
        for (int i = 0; i < myArr.length; i++){
            myArr[i] = r.nextInt(maxVal - minVal) + minVal;
        }
        return myArr;
    }

    public static void printMinMax(int[] arr){
        if (arr.length > 0){
            int min = arr[0], max = arr[0];
            for (int i: arr){
                if (i < min) min = i;
                if (i > max) max = i;
            }
            System.out.println("Минимальное значение " + min + "Максимальное значение " + max);
        } else {
            System.out.println("Получен пустой массив");
        }
    }
}