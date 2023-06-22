package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в файл
public class test4 {

    public static void main(String[] args) {
        boo(foo("TEST", 10));
    }

    public static String foo(String str, int length){
        StringBuilder myStr = new StringBuilder();
        for (int i = length; i > 0; i--){
            myStr.append(str).append("\n");
        }

        return myStr.toString();
    }

    public static void boo(String str){
        try(FileWriter fw = new FileWriter(new File("write.txt"))) {
            fw.write(str);
            String path = System.getProperty("user.dir").concat("/src");
            File dir = new File(path);
            if (dir.mkdirs()){
                System.out.println("+");
            } else {
                System.out.println("-");
            }

            System.out.println(path);
            for (String fName: dir.list()){
                fw.append(fName+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
