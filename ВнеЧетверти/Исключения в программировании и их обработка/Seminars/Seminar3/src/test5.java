//Задание №4
//        1. Напишите метод,на вход которогоподаётся двумерный строковый массив
//        размером 4х4. При подаче массива другого размера необходимо бросить
//        исключение MyArraySizeException.
//        2. Далееметод долженпройтисьпо всем элементам массива,преобразоватьв
//        int и просуммировать. Если в каком-то элементе массива преобразование
//        не удалось (например, в ячейке лежит символ или текст вместо числа),
//        должно быть брошено исключение MyArrayDataException с детализацией, в
//        какой именно ячейкележат неверныеданные.
//        3. В методе main() вызвать полученный метод, обработать возможные
//        исключения MyArraySizeException и MyArrayDataException и вывести
//        результатрасчета (сумму элементов,при условиичто подали на вход
//        корректныймассив).


public class test5 {
    public static void main(String[] args) {
        String[][] arr_test = new String[][]{{"1","2","5","4"},{"1","2","3","4"},{"1","2","fg","4"},{"1","2","3","4"}};
        try {
            System.out.println(summArr(arr_test));
        }catch (MyArraySizeException e){
            e.message();
        }catch (MyArrayDataException e){
            e.message();
        }
    }

    public static int summArr(String[][] myArr){
        int mySum = 0;
        if(myArr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myArr.length; i++){
            if(myArr[i].length != 4){
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < myArr.length; i++){
            for (int j = 0; j < myArr[i].length; j++){

                try {
                    mySum += Integer.parseInt(myArr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return mySum;
    }
}
