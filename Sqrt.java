import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int n){
        int p = 0; 
        while(p*p<n){   
            p++;
        }
        if(p*p==n)
        return p;
        else
        return p-1;
    }
}
