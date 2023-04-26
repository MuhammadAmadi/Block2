import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        String lastName = null;
        try(Scanner in = new Scanner(System.in)) {
            if (in.hasNext("[A-Za-zА-Яа-я]+"))
                lastName = MyHumanDataBase.myDataParse(in.nextLine(), lastName);
            else
                throw new MyInvalidInputFormat(in.nextLine().replaceAll("[A-Za-zА-Яа-я]*", ""));
        }catch (MyInvalidInputFormat e){

        }
    }
}