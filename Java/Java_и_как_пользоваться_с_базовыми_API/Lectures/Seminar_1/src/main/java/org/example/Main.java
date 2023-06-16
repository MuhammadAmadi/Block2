package org.example;
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {1,1,1,0,1,0};
        int count = 1;
        int max = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] == 1) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
                if (max < count){
                    max = count;
                }
            } else {
                if (max == 0) count = 0;
                else count = 1;
            }


        }

        System.out.println(max);
    }
}