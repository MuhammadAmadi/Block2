package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку найти и удалить целые числа.
public class test3 {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        Collections.addAll(arrList,"2","jh","765","jn","45","null");
        System.out.println(arrList);
        int i = 0;
        while (i < arrList.size()) {
            if (isInt(arrList.get(i))){
                arrList.remove(arrList.get(i));
            }
            i++;
        }
        System.out.println(arrList);

    }

    public static boolean isInt(String str){
        try {
            int i = Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
