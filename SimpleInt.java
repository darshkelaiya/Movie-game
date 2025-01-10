import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount = ");
        int principle = sc.nextInt();
        System.out.print("Enter Rate of Interest = ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time period = ");
        int time = sc.nextInt();

        float y = simpleInterest(principle,rate,time);
        System.out.println("Simple Interest = "+ y);
        
    }

    public static float simpleInterest(int a,float b, int c){
        
        float x = a*b*c/100;
        return x;

    }
}
