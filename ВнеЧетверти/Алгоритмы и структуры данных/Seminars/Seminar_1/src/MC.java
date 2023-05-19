import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MC {
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;

        // O(n)
    }

    public static int sumEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i += 2){
            sum += array[i];
        }
        return sum;
        // O(n/2) == O(n)
    }

    public static int sumDiagonal(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length && i < array[i].length; i++){
            sum += array[i][i];
        }
        return sum;
        // O(n)
    }

    public static int logarithm(int[] array){
        int sum = array[0];
        for (int i = 1; i < array.length;i *= 2){
            sum += array[i];
        }
        return sum;
        // O(log(n))
    }

    public static int fibonacciRec(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }

    public static int fibonacciFast(int n){
        int a = 0;
        int b = 1;
        int sum = n;
        for (int i = 2; i <=n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }

    public static int[] findSum (int[] array, int target){
        for (int i = 0; i < array.length-1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] findSumMap (int[] array, int target){
        Map<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            map.put(array[i],i);
        }
        Integer pair;
        for (int i = 0; i < array.length; i++){
            pair = map.get(target - array[i]);
            if (pair != null && pair != i){
                return new int[]{i, pair};
            }
        }
        return new int[] {-1,-1};
    }

    public static void collapse(int[] array){
        Integer[] collapseArr = new Integer[array.length];
        int idx = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i-1] != array[i]){
                collapseArr[idx] = array[i-1];
                idx++;
                if (i== array.length-1){
                    collapseArr[idx] = array[i];
                    idx++;
                }
            } else if (i == array.length-1) {
                collapseArr[idx] = array[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(collapseArr));
    }
}
