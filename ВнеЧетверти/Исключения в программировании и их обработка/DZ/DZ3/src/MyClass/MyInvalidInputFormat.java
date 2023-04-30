package MyClass;

public class MyInvalidInputFormat extends RuntimeException {
    private String message;
    public MyInvalidInputFormat(){}

    public MyInvalidInputFormat(String message){
        this.message = message;
    }
    public void printMessage(){
        System.out.println(message);
    }

}
