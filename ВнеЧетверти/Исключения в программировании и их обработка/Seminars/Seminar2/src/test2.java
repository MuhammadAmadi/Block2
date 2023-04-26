public class test2 {
    public static int sum2d(String[][]arr){
        int val;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                try {
                    val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }catch (NumberFormatException e){
                    continue;
                }catch (ArrayIndexOutOfBoundsException e){
                    break;
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] number = {{"1", "5", "hjk", "8"}, {"3", "76", "45", "dfg"}};
        System.out.println(sum2d(number));
    }
}
