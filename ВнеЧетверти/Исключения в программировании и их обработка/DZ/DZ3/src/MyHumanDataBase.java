import java.util.regex.Pattern;

public class MyHumanDataBase {

    public static String myDataParse (String name, String last_name){
        String [] myData = name.split(" ");
        if (myData.length != 6)  throw new MyInvalidInputFormat("Неверный ввод данных нужно ввести 6 элементов вы ввели "
                + myData.length + "последний элемент " + myData[myData.length-1]);
        boolean check = last_name != null;
        for (String i : name.split(" ")){
            if (Pattern.matches("[a-zA-Z]+",i)){
                if (check && last_name == i){

                }
            }
        }
        return name;
    }
}
