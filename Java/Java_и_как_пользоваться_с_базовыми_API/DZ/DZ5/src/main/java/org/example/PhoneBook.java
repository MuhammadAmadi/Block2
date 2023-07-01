package org.example;

import java.util.*;

//Реализовать консольное приложение - телефонный справочник.
//        У одной фамилии может быть несколько номеров.
//        Пользователь может вводить команды:
//        1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
//        2: GET Ivanov - получить список всех номеров по фамилии
//        3: REMOVE Ivanov - удалить все номера по фамилии
//        4: LIST - Посмотреть все записи
//        5: EXIT - Завершить программу
//
//        Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом.
//
//        Пример взаимодействия (=> - это вывод на консоль):
//        ADD Ivanov 8 800 555 35 35
//        ADD Ivanov 8 800 100 10 10
//        GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
//        ADD Petrov 8 555 12 34
//        LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
//        REMOVE Ivanov
//        LIST => Petrov = [8 555 12 34]
//        GET NoName => Не найдена запись с фамилией "NoName"
//        REMOVE NoName => Не найдена запись с фамилией "NoName"3
public class PhoneBook {
    private HashMap<String, List> contacts;

    public PhoneBook(){
        contacts = new HashMap<>();
    }

    public void add(String name, String number){
        List<String> numbers;
        if (contacts.containsKey(name)){
            numbers = contacts.get(name);
        } else {
            numbers = new ArrayList<>();
            contacts.put(name,numbers);
        }

        numbers.add(number);
    }
    public void get(){
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            get(name);
        }
    }
    public void get(String name){
        List<String> numbers = contacts.get(name);
        System.out.println(numbers);
    }
    public void remove(String name){
        if(contacts.containsKey(name)){
            contacts.remove(name);
        } else {
            System.out.println("Имя " + name + "не найдено");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("> ");
            String[] textIn = scanner.next().split(" ");
            String command = textIn[0];
            StringBuilder name;
            StringBuilder number;
            for (String s : textIn) {
                name.append()
            }
//            if (command == 1){
//                System.out.println("Введите имя");
//                String name = scanner.next();
//                System.out.println("Введите номер телефона");
//                String number = scanner.next();
//                phoneBook.add(name,number);
//            } else if (command == 2) {
//                phoneBook.get();
//            } else if (command == 3) {
//                System.out.println("Введите имя");
//                String name = scanner.next();
//                phoneBook.remove(name);
//            }

        }
    }
}