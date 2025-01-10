import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = nums1.length - nums2.length;;
        int n = nums2.length;

        for (int i = 0; i < m+n; i++) {
            if(i>=m)
            nums1[i]=nums2[i-m];
        }

        for (int i = m+n-2; i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                if(nums1[i]>nums1[i+1]){
                    int temp = nums1[i];
                    nums1[i] = nums1[i+1];
                    nums1[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));

    }
}
