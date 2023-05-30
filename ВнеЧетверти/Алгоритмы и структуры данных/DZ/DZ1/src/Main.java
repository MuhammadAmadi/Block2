import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Реализовать сортировку подсчетом.
 *
 */


public class Main {
    public static void main(String[] args) {
        int[] ints = IntStream.generate(() ->ThreadLocalRandom.current().nextInt(100)).limit(20).toArray();
        System.out.println(Arrays.toString(ints));
        countingSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    static void countingSort(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int el: array){
            if (el < min) min = el;
            else if (el > max) max = el;
        }

        int corr = min != 0 ? -min : 0;
        max += corr;

        int[] count = new int[max + 1];

        for (int i = 0; i < array.length; i++ ){
            count[array[i] + corr]++;
        }

        int idx = 0;

        for (int i = 0; i < count.length; i++){
            for (int j = 0; j < count[i]; j++){
                array[idx] = i - corr;
                idx++;
            }
        }

    }
}