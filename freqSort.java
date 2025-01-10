import java.util.Arrays;

public class freqSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2};
        int[] k = new int[arr.length];
        
        for (int i = 0;i<arr.length;i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                c++;
            }
            k[i]=c;
        }

        for (int i = arr.length-1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if(k[j]>k[j+1]){
                    swap(k, j, j+1);
                    swap(arr, j, j+1);
                }
                if(k[j]==k[j+1] && arr[j]<arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int x, int y){
        int d = arr[x];
        arr[x] = arr[y];
        arr[y] = d;
    }
}