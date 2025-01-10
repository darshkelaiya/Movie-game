/*Extra Problems: 
1. Given an integer array nums, find the subarray  with the largest sum, and return its sum
     Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     Output: 6
     Explanation: The subarray [4,-1,2,1] has the largest sum 6.

2. Sort the given array in O(n) time(i.e. using only one loop)
     A=[0, 1, 1, 1, 0, 0, 0, 1, 1, 0] */

import java.util.Arrays;

public class Dsa {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxindex(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max(arr)){
                index = i;
                break;
            }
        }
        return index;
    }

    static int maxSum(int[] arr){
        int sum = 0;
        int temp = 0;
        for (int i = arr.length-1; i>=maxindex(arr); i--) {
            sum = 0;
            for (int j = i; j>=maxindex(arr); j--) {
                sum = sum + arr[j];
            }
            if(sum>temp)
            temp = sum; 
        }
        return temp;
    }
}

class something {
    public static void main(String[] args) {
        int[] A={0, 1, 1, 1, 0, 0, 0, 1, 1, 0};
        sort(A);
        System.out.println(Arrays.toString(A));       
    }

    static void sort(int[] arr){
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            zeros++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<zeros)
            arr[i]=0;
            else 
            arr[i]=1;
        }
    }
}