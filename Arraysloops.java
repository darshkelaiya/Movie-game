import java.util.Arrays;

public class Arraysloops {
    public static void main(String[] args){
        int[] nums = {5,4,-1,7,8};
        int start = 0;
        int end = 0;
        int maxsum = 0;
        if(maxInd(nums)==nums.length-1){
            for (int i = 0; i < nums.length; i++) {
                int temp = 0;
                
                for (int j = i; j < nums.length; j++) {
                    temp+=nums[j];
                    if(maxsum<temp){
                        maxsum = temp;
                        start = i;
                        end = j;
                    }
                    
                }                
            }
        } else {
            for (int i = nums.length-1; i>=maxInd(nums); i--) {
                int temp = 0;
                
                for (int j = maxInd(nums); j <=i; j++) {
                    temp += nums[j];
                    if(maxsum<temp){
                        maxsum = temp;
                        start = maxInd(nums);
                        end = j;
                    }
                }
                
            }

            for (int i = 0; i <=maxInd(nums); i++) {
                int temp = 0;
                //int count = 0;
                for (int j = i; j <= maxInd(nums); j++) {
                    temp += nums[j];
                    if(maxsum<temp){
                        maxsum = temp;
                        start = i;
                        end = maxInd(nums);
                    }   
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, start, end+1)));
        System.out.println(maxsum);
    }

    public static int maxInd(int[] arr){
        int index = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                index = i;
            }
        }
        return index;
    }
}
