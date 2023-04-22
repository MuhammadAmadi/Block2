package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");

        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (Exception e){
            System.out.println("Указан индекс за пределами массива");
        }
    }

}
