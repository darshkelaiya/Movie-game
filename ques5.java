public class ques5 {
    public static void main(String[] args) {
        int[] arr = {112,23,443,675,565};
        int max = 0;
        int max2 = 0;
        for(int i = 0; i<arr.length; i++){
            
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==max){
                continue;
            } else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        
        System.out.println("Largest number: " + max);
        System.out.println("Second Largest number: " + max2);
    }
}
