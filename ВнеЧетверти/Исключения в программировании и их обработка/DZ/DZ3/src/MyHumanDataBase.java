import java.util.List;
import java.util.regex.Pattern;

public class MyHumanDataBase {

    public static String myDataParse (String name, String last_name){
        boolean check = true;
        if (last_name == null) check = false;
        for (String i : name.split(" ")){
            if (Pattern.matches("[a-zA-Z]+",i)){
                if (check && last_name == i){

                }
            }
        }
        return name;
    }
}
