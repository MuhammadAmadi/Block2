package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class DZ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("HH.mm");
        Date date = new Date();
        Double hour = Double.parseDouble(dateFormat.format(date));
        System.out.println("Введите имя");
        String name = input.next();

        if (hour >= 5.0 && hour < 12.0) System.out.println("Доброе утро, " + name);
        if (hour >= 12.0 && hour < 18.0) System.out.println("Добрый день, " + name);
        if (hour >= 18.0 && hour < 23.0) System.out.println("Добрый вечер, " + name);
        if (hour >= 23.0 && hour < 24.0 || hour >= 0.0 && hour < 5.0) System.out.println("Доброй ночи, " + name);

    }
}
