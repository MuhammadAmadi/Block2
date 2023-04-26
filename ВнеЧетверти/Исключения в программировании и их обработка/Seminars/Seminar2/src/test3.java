//Запишите в файл следующие строки:
//        Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
//        если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
//        значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа
//        или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> page = new ArrayList<>();
        try(Scanner file = new Scanner(new FileReader("demo.txt")))
        {
            while (file.hasNext()){
                page.add(file.nextLine());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < page.size(); i++){
            if (page.get(i).contains("?")){
                String[] temp = page.get(i).split("=");
                String str = Integer.toString(temp[0].length());
                page.set(i, page.get(i).replace("?",str));
            }
        }

        try (FileWriter fw = new FileWriter("demo1.txt")) {
            for (var text: page){
                fw.write(text+"\n");
            }
            System.out.println("Запись прошла успешно");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
