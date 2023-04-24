//Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого
//метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение,
//которое вызвал метод doSomething().


import java.io.IOException;

public class test2 {

    public static void main(String[] args) {
        try {
            doSomething();
        }catch (IOException e){
            System.out.println("Ошибка исправьте");
        }

    }
    public static void doSomething() throws IOException {

    }
}
