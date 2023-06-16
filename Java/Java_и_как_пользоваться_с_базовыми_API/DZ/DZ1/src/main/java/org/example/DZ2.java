package org.example;

import java.util.Arrays;

//2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
public class DZ2 {

    public static void main(String[] args) {
        printMatrix(createMatrix(9));
    }
    public static int[][] createMatrix(int length){
        int [][] matrix = new int[length][length];
        for (int i = 0; i < matrix.length; i++){
            matrix[i][i] = 1;
            matrix[matrix.length - i - 1][i] = 1;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
