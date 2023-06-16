package org.example;

import java.util.Arrays;

//4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
// или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры:
// [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг, можете выбирать сами.
public class DZ4 {
    public static void main(String[] args) {
        int[] arr = new int[] {6, 1, 3, 5, 8};
        System.out.println(Arrays.toString(arr));
        scroll(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void scroll(int[] arr, int value){
       int temp, scroll;
       for (int k = 0; k < Math.abs(value); k++) {

           if (value > 0) {
               temp = arr[0];
               for (int i = 0; i < arr.length - 1; i++) {
                   scroll = (i + 1) % arr.length;
                   arr[i] = arr[scroll];
               }
               arr[arr.length - 1] = temp;
           } else {
               temp = arr[arr.length - 1];
               for (int i = arr.length - 1; i > 0; i--) {
                   scroll = (i - 1);
                   arr[i] = arr[scroll];
               }
               arr[0] = temp;
           }
       }
    }
}
