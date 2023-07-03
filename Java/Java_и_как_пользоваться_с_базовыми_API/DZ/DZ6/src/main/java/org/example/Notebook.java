package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Notebook {
    private static String[] nameFields = {"Производитель","Модель","Тип накопителя","Объем накопителя","Процессор",
            "Видеокарта","Цвет"};
    private Map<String, String> fields = new HashMap<>();

    public static int idx(String str){
        for (int i = 0; i < nameFields.length; i++) {
            if (nameFields[i].equalsIgnoreCase(str)) return i;
        }
        return -1;
    }

    public Notebook(){
        for (String nameField : nameFields) {
            fields.put(nameField, "");
        }
    }

    public void set(){
        Scanner scanner = new Scanner(System.in);
        for (String s : fields.keySet()) {
            System.out.print(s + " > ");
            fields.put(s, scanner.nextLine());
        }
    }

    public void set(String... args){
        for (String arg : args) {
            String[] str = arg.split(",");
            int idx = idx(str[0]);
            if (idx >= 0) fields.put(nameFields[idx],str[1]);
            else System.out.println("Поле " + str[0] + " не найдено");

        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String s : nameFields) {
            str.append(s).append(":").append(fields.get(s)).append("\n");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(fields, notebook.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }
}
