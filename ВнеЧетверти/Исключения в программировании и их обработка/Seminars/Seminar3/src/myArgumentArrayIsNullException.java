public class myArgumentArrayIsNullException extends IllegalArgumentException{
    public void message(int index){
        System.out.println("Ошибка элемент массива равен Null, его Индекс = " + index );
    }
}
