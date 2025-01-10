public class ques2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,34,5,6,456,523,4545,394};
        int c1 = 0; 
        int c2 = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                c1++;
            } else{
                c2++;
            }
        }
        System.out.println("Even numbers: " + c1);
        System.out.println("Odd numbers: " + c2);
        
    
    }
}
