import java.util.Scanner;

public class wayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        String[] arr = new String[n+1];
        int[] arr1 = new int[n+1];
        

        for(int i = 0; i<n+1; i++){
            arr[i] = sc.nextLine();
            arr1[i] = arr[i].length() - 2;
            
        }

        for(int i = 0; i<n+1; i++){
            if((arr1[i]+2)>10){
                System.out.print(arr[i].charAt(0));
                System.out.print(arr1[i]);
                System.out.print(arr[i].charAt(arr1[i]+1)); 
                System.out.println();
                } else {
                    System.out.println(arr[i]);
                }
        }
    }
}
