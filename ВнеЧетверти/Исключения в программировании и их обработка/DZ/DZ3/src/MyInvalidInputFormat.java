
public class MyInvalidInputFormat extends RuntimeException {

    public MyInvalidInputFormat(){}

    public MyInvalidInputFormat(String message){
        System.out.println(message);
    }

}
