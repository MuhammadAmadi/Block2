import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {2,5,7,9,1,4,8,6,0,9,3,4,5};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int minPos = i;
            for (int j = i + 1; j < array.length;j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            if (i != minPos){
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }
    }

    public static void insertSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            for (int j = i + 1; j < array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
    }

    private static void quickSort(int[] array, int startPos, int endPos){
        int leftPos = startPos;
        int rightPos = endPos;
        int pivot = array[(startPos+endPos)/2];

        do {
            while (array[leftPos] < pivot){
                leftPos++;
            }
            while (array[rightPos] > pivot){
                rightPos--;
            }
            if (leftPos<=rightPos){
                if (leftPos < rightPos){
                    int temp = array[leftPos];
                    array[leftPos] = array[rightPos];
                    array[rightPos] = temp;
                }
                leftPos++;
                rightPos--;
            }
        }while (leftPos<=rightPos);

        if (leftPos < endPos){
            quickSort(array, leftPos, endPos);
        }
        if (startPos < rightPos){
            quickSort(array, startPos, rightPos);
        }
    }

    public static void heapSort(int[] array){
        for (int i = array.length/2; i >=0; i--){
            heapSort(array, array.length, i);
        }
        for (int i = array.length-1; i >=0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapSort(array, i, 0);
        }
    }
    private static void heapSort(int[] array, int size, int idx){
        int largest = idx;
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < size && array[left] > array[largest]){
            largest = left;
        }

        if (right < size && array[right] > array[largest]){
            largest = right;
        }

        if (largest != idx){
            int temp = array[idx];
            array[idx] = array[largest];
            array[largest] = temp;

            heapSort(array, size, largest);
        }
    }
}