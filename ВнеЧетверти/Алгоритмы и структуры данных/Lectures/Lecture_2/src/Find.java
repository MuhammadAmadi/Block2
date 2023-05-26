import java.util.Arrays;

public class Find {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,8,9,10,15,20};
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,5));
    }

    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length-1);
    }

    private static int binarySearch(int[] array, int value, int minIdx, int maxIdx){
        int midIdx;
        if (maxIdx >= minIdx) {
            midIdx = (maxIdx - minIdx) / 2 + minIdx;
            if (array[midIdx] > value){
                return binarySearch(array,value,minIdx,midIdx-1);
            }
            if (array[midIdx] < value){
                return binarySearch(array,value,midIdx+1, maxIdx);
            }
            if (array[midIdx] == value){
                return midIdx;
            }
        }
        return -1;
    }
}
