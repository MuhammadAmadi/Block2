public class MyArrayDataException extends NumberFormatException{
    private int i = 0;
    private int j = 0;
    public MyArrayDataException(){
    }
    public MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void message(){
        System.out.println("Невозможно пробразовать в int элемент стоящий на позиции "+i+" ; "+j);
    }
}
