import java.util.Scanner;

public class Kthnumber {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] arr = {1,2,3,4};

        for (int i = 0; i < a.length; i++) {
            a[i]=i+1;
        }

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int c = k;
        boolean ismatching = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(a[i]==arr[j]){
                    ismatching = true;
                    break;
                }
            }

            if(ismatching==true)
            k=k-1;

            if(c-4==k){
                System.out.println(a[i]+2);
                break;
            }
        }
    }
}
