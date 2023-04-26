import MyClass.*;

import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        String lastName = null;
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Введите ФИО, дата рождения в формате dd.mm.yyyy, номер телефона только цифры без знаков" +
                    "до 13 цифр, пол f-женский m-мужской");
            if (in.hasNext("[A-Za-zА-Яа-я0-9]+"))
                lastName = MyHumanDataBase.myDataParse(in.nextLine());
            else
                throw new MyInvalidInputFormat("Неверный"+in.nextLine().replaceAll("[A-Za-zА-Яа-я0-9]*", ""));
        }catch (MyInvalidInputFormat e){
            e.printMessage();
        }
        System.out.println(lastName);
    }
}