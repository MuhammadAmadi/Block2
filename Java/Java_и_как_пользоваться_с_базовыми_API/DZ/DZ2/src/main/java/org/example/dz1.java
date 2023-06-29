package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class dz1 {
    public static void main(String[] args) throws Exception {
        String [] list = ReadLineFromFile("dz1.txt");
        System.out.println(list[0]);
        StringBuilder resultSelect = LineInList(list[0]);
        System.out.println(resultSelect);
    }
    public static StringBuilder LineInList(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }

        }
        return result;
    }

    public static String [] ReadLineFromFile(String pathway){
        int size = 0;
        String str;
        String [] listData;
        try (BufferedReader br = new BufferedReader(new FileReader(pathway));) {
            while (br.readLine() != null) {
                size ++;
            }
            listData = new String [size];
            int i = 0;
            BufferedReader br1 = new BufferedReader(new FileReader(pathway));
            while ((str = br1.readLine()) != null) {
                listData[i] = str;
                i += 1;
            }
            br1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listData;

    }
}