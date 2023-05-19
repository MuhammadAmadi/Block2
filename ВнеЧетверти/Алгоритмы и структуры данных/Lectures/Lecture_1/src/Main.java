
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Integer> availableDivider = Algorithm.findSimpleNumbers(10);
        for (Integer integer: availableDivider) {
            System.out.println(integer);
        }
        AtomicInteger count = new AtomicInteger(0);
        System.out.println("Count: " + count + "\nFib: "+ Algorithm.fib(10, count));
    }






}