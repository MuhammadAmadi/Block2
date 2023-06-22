package org.example;
//Напишите метод который сжимает строку
// Пример:
// Ввод: aaaabbbcdd
// Вывод: a4b3cd2
public class test2 {

    public static void main(String[] args) {
        String str = "naaaabbbcddf";
        System.out.println(crl(str));
    }

    public static String crl(String str){
        StringBuilder myStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                if (count > 1) {
                    myStr.append(str.charAt(i)).append(count);
                    count = 1;
                } else {
                    myStr.append(str.charAt(i));
                }
            }
        }
        if (count > 1) myStr.append(str.charAt(str.length()-1)).append(count);
        else myStr.append(str.charAt(str.length()-1));
        return myStr.toString();
    }
}
