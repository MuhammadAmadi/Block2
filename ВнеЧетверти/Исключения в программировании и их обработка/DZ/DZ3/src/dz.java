import MyClass.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class dz {
    public static String isFileExists(String[] name){
        String[] temp = Arrays.copyOf(name,name.length);
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 3; i++) {
                Path j = Paths.get(temp[i] + ".txt");
                if (Files.exists(j)) {
                    return j.toString();
                }
                temp[i] = temp[i].substring(0,temp[i].length()-1);
            }
        }
        return name[0]+"txt";
    }
    public static void myWriter(Object myObj) throws IOException{
        if (myObj == null){
            throw new MyInvalidInputFormat("Метод myWriter получил пустой объект");
        }

        String myLine = myObj.toString().replaceAll(",",";");
        String[] temp = Arrays.copyOfRange(myLine.split(";"),0,4);
        String nameFile = isFileExists(temp);
        try(BufferedWriter fw = new BufferedWriter(new FileWriter(nameFile,true));
            Scanner fr = new Scanner(new FileReader(nameFile))) {

            while (fr.hasNext()){
                int count = 0;
                for (var i: fr.nextLine().split(";")){
                    for (var j : temp){
                        if (i.equals(j)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count >= 4) {
                    System.out.println("Такая запись " + myLine + " уже существует");
                    return;
                }
            }
            fw.write(myLine+"\n");
        }
    }
    public static void main(String[] args) {
        String lastName = null;
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Введите ФИО, дата рождения в формате dd.mm.yyyy, номер телефона только цифры без знаков" +
                    "до 13 цифр, пол f-женский m-мужской");
            lastName = MyHumanDataBase.myDataParse(in.nextLine()).replaceAll("[\\[\\] ]", "");
            myWriter(lastName);

        }catch (MyInvalidInputFormat e){
            e.printMessage();
        }catch (IOException e){
            System.out.println("Что то пошло не так "+e.getMessage());
        }
        System.out.println(lastName);
    }
}