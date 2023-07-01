package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//        > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//        > java
//        > python
//        > c#
//        > print
//        < [c#, python, java]
//        > revert
//        > print
//        < [python, java]
//        > revert
//        > revert
//        > print
//        < []
//        > revert -> throw new NoSuchElementException
public class dz1 {
    public static void main(String[] args) {
        foo();
    }

    private static void foo(){
        Scanner scanner = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        String command;
        while (true){
            System.out.print("> ");
            command = scanner.nextLine();
            if("print".equals(command)){
                System.out.println("< " + strList);
                continue;
            }
            if("revert".equals(command)){
                try {
                    strList.remove(0);
                } catch (IndexOutOfBoundsException e){
                    System.err.println("Лист пустой нечего удалять");
                }
                continue;
            }
            if("exit".equals(command)) break;

            strList.add(0,command);
        }
    }
}