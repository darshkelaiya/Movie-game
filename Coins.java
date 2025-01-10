import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int sum = 0;
        while(sum<=n){
            k++;
            sum = sum+k;
        }
        k--;
        System.out.println(k);
    }
}
