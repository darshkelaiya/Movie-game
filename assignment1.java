import java.util.Arrays;

public class assignment1 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] unique = new int[nums.length];
        int index  = 0;
        boolean isRepeating = false;
        for(int i = 0; i<nums.length; i++){
            isRepeating = false;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    isRepeating = true;
                }
            }
            if(isRepeating==false){
                unique[index]=nums[i];
                index++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            nums[i]=unique[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(index);
    }
}
