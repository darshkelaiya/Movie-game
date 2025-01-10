import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0; 
        int b = 1;
        int temp;
        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i<n; i++){ 
            temp = a+b;
            System.out.println(temp + " ");
            a = b;
            b = temp;

        }
    }
}
