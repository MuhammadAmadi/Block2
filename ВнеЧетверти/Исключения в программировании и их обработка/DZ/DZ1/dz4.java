//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
//не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//которое пользователь может увидеть - RuntimeException, т.е. ваше.


package example;

import java.util.Arrays;

public class dz4 {
    public static int[] arrayQuotient(int[] divisible, int[] divisor){

        if (divisible == null || divisor == null){
            throw new RuntimeException("в качестве аргумента получен null");
        }

        if (divisible.length != divisor.length){
            throw new RuntimeException("длины массивов не равны");
        }
        int[] quotient = new int[divisible.length];
        for (int i = 0; i < quotient.length; i++){
            if (divisor[i] == 0){
                throw new RuntimeException("Нельзя делить на ноль");
            }
            quotient[i] = divisible[i] / divisor[i];
        }
        return quotient;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,0};
        System.out.println(Arrays.toString(arrayQuotient(arr1,arr2)));
    }
}
