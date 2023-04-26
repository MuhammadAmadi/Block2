package MyClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class MyHumanDataBase {
    private static boolean isNumeric(String s){return isNumeric(s,false);}
    private static boolean isNumeric(String s ,boolean b) {
        if (s.chars().allMatch(Character::isDigit) && s.length() <= 13)
            return true;
        if (b) return false;
        throw new MyInvalidInputFormat("Неверный формат номера телефона ожидается в формате 7хххххххххх получено " + s);
    }
    private static boolean isDateValid(String date){return isDateValid(date, false);}
    private static boolean isDateValid(String inputDate,boolean b)
    {
        String date = inputDate.replace(",",".").replace("-",".").replace("/",".");
        String DATE_FORMAT = "dd.mm.yyyy";
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            if (b) return false;
            throw new MyInvalidInputFormat("Неверный формат даты ожидается дата типа dd.mm.yyyy получено " + date);
        }
    }

    public static String myDataParseLine (String name){

        String [] myData = name.split(" ");
        StringBuilder strData = new StringBuilder();

        if (myData.length != 6)  throw new MyInvalidInputFormat("Неверный ввод данных нужно ввести 6 элементов" +
                "1)Фамилия\n2)Имя\n3Отчество\n4)Дата рождения\n5)Номер телефона\n6)пол\nвы ввели "+ myData.length+"элементов");

        for (int i = 0; i < myData.length; i++){
            if (myData[i].length() > 1 && (Pattern.matches("[a-zA-Zа-яА-Я]+",myData[i]))){
                if (i < 3)
                    strData.append(myData[i]).append(" ");
                else
                    throw new MyInvalidInputFormat("Неверный ввод данных ожидается данные типа dd.mm.yyy получено "+myData[i]);
            }else if (i == 3 && isDateValid(myData[i]))
                strData.append(myData[i].replace(",",".").replace("-",".").replace("/",".")).append(" ");
            else if (i == 4 && isNumeric(myData[i]))
                strData.append(myData[i]).append(" ");
            else if (i == 5 && (Pattern.matches("[fmFM]+",myData[i])))
                strData.append(myData[i]);
            else throw new MyInvalidInputFormat("Невереный ввод данных " + myData[i]);
        }
        return strData.toString();
    }

    public static String myDataParse (String name){

        String [] myData = name.split(" ");
        StringBuilder strDataHuman = new StringBuilder();
        String strDataBirthday = "", strDataPhoneNumber = "", strDataGender = "";

        if (myData.length != 6)  throw new MyInvalidInputFormat("Неверный ввод данных нужно ввести 6 элементов" +
                "1)Фамилия\n2)Имя\n3Отчество\n4)Дата рождения\n5)Номер телефона\n6)пол\nвы ввели "+ myData.length+"элементов");

        for (String myStr: myData){
            if (myStr.length() > 1) {
                if (Pattern.matches("[a-zA-Zа-яА-Я]+", myStr)) {
                    if (strDataHuman.toString().split(" ").length < 3) {
                        strDataHuman.append(myStr).append(" ");
                        continue;
                    }
                    throw new MyInvalidInputFormat("Неверный ввод данных ожидается ввод года рождения, телефона или гендера получено " + myStr);
                }
                if (isDateValid(myStr, true)) {
                    strDataBirthday = myStr.replace(",",".").replace("-",".").replace("/",".") + " ";
                    continue;
                }
                if (isNumeric(myStr, true)) {
                    strDataPhoneNumber = myStr + " ";
                    continue;
                }
            }
            if (Pattern.matches("[fmFM]+",myStr)) {
                strDataGender = myStr.toLowerCase();
                continue;
            }
            throw new MyInvalidInputFormat("Невереный ввод данных " + myStr);
        }
        if (!strDataBirthday.isEmpty() && !strDataPhoneNumber.isEmpty() && !strDataGender.isEmpty())
            strDataHuman.append(strDataBirthday).append(strDataPhoneNumber).append(strDataGender);
        else {
            if (strDataBirthday.isEmpty()){
                throw new MyInvalidInputFormat("Ошибка введите дату рождение");
            }
            if (strDataPhoneNumber.isEmpty()){
                throw new MyInvalidInputFormat("Ошибка введите номер телефона");
            }
            throw new MyInvalidInputFormat("Ошибка введите пол");
        }
        return strDataHuman.toString();
    }
}
