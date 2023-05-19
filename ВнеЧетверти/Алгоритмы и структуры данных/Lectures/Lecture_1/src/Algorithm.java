import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Algorithm {

    public static List<Integer> findAvailableDivider(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int number){
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        int k;
        for (int i = 2; i <= number; i++){
            boolean simple = true;
            k = (int)Math.sqrt(i);
            for (int j = 2; j <= k; j++){
                counter ++;
                if (i % j == 0){
                    simple = false;
                    break;
                }
            }

            if(simple){
                result.add(i);
            }
        }
        System.out.println(counter);
        return result;
    }

    public static int fib(int number, AtomicInteger count){
        count.incrementAndGet();
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }

        return fib(number-1, count) + fib(number-2, count);
    }
}
