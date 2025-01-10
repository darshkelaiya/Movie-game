import java.lang.reflect.Array;
import java.util.Arrays;

public class SelecSort {
    public static void main(String[] args) {
        int[] arr = {102,14,31,64,71,92,101};        
        //System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            last = arr.length-i-1;
            int maxindex = getMaxIndex(arr,last);
            swap(arr, maxindex, last);
        }
        
    }

    static int maximum(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int getMaxIndex(int[] arr,int last){
        int x  =0;
        for (int i = 0; i <= last; i++) {
            if(arr[i]==maximum(arr, last)){
                x = i;
            }
        }
        return x;
    }

    static void swap(int[] arr,int first, int last){
        int temp = 0;
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
