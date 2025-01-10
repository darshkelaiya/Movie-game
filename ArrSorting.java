import java.util.Arrays;

public class ArrSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,4,45,24,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<=arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
