package org.example;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;
public class dz2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(dz2.class.getName());
        FileHandler fh = new FileHandler("logDz2.xml");
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        printArray(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArray(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {

            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }

}
