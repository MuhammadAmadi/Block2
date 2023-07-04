package org.example;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например,
// спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки,
// что соответствуют условию

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook as514 = new Notebook("производитель, Асус","Модель, as-514","Тип накопителя, ссд",
                "Объем накопителя, 512","цвет, черный","Объём ram, 16","Видеокарта, NVIDIA GTX 1050TI");
        Notebook as513 = new Notebook("производитель, Асус","Модель, as-513","Тип накопителя, ссд",
                "Объем накопителя, 512","цвет, розовый","Объём ram, 8");
        Notebook sm110 = new Notebook("производитель, Сасмунг","Модель, см-110","Тип накопителя, жд",
                "Объем накопителя, 512","цвет, черный","Объём ram, 8");
        Notebook sm150 = new Notebook("производитель, Сасмунг","Модель, см-150","Тип накопителя, ссд",
                "Объем накопителя, 1024","цвет, желтый","Объём ram, 32","Видеокарта, NVIDIA GTX 2060Super","процессор, AMD Ryzen 7 5800");
        Notebook ac1505 = new Notebook("производитель, Ацер","Модель, ац-1505","Тип накопителя, ссд",
                "Объем накопителя, 256","цвет, желтый","Объём ram, 4");
        Notebook ac1787 = new Notebook("производитель, Ацер","Модель, ац-1787","Тип накопителя, ссд",
                "Объем накопителя, 128","цвет, розовый","Объём ram, 4");

        List<Notebook> notebookList = List.of(as514,as513,sm110,sm150,ac1505,ac1787);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите\n1 - для поиска по цвету\n2 - чтобы указать минимальный объем оперативки");
        int command = scanner.nextInt();
        scanner.nextLine();
        if (command == 1){
            System.out.print("Введите цвет: > ");
            String color = scanner.nextLine().trim();
            for (Notebook notebook : notebookList) {
                if (notebook.get("Цвет").equalsIgnoreCase(color)) System.out.println(notebook);
            }
        } else if (command == 2){
            System.out.print("Введите минимальный объем оперативной памяти: > ");
            int ram = scanner.nextInt();
            for (Notebook notebook : notebookList) {
                if (Double.parseDouble(notebook.get("Объём RAM")) >= ram) System.out.println(notebook);
            }
        }
        scanner.close();
    }
}