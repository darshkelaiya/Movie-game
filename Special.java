public class Special {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(special(nums));

    }
    
    static int special(int[] arr){
        int x = 1;
        int a = 0;
        while (x!=a) {
            a = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>=x){
                    a++;
                }
            }
            x++;
            if(a==0)
            return -1;
        }
    
        return x;
    }
}
