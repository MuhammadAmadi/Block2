package org.example;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину");
        int length = input.nextInt();
        System.out.println("Введите символ 1");
        char c1 = input.next().charAt(0);
        System.out.println("Введите символ 2");
        char c2 = input.next().charAt(0);

        System.out.println(foo(length, c1, c2));

    }

    public static String foo (int N, char c1, char c2){
        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < N / 2; i++){
            myStr.append(c1).append(c2);
        }
        return myStr.toString();
    }
}