import java.io.IOException;

public class myNotFileException extends IOException {
    public void message(){
        System.out.println("Файл с таким именем не сушествует");
    }
}
