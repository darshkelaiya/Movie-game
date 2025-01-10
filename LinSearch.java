public class LinSearch {
    public static void main(String[] args) {
        int[] arr = {2,14,31,64,71,92,1};
        int target = 64;
        LinearSearch(arr, target);
    }

    static void LinearSearch(int[] arr,int target){
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }
}
