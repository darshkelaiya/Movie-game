import java.util.Arrays;
import java.util.Scanner;

public class stack {
    static int top = -1;
    public static void main(String[] args) {
        int[] s = new int[10];

        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a>=1 && a<=4) {
            System.out.print("Enter the function number : ");
            a = sc.nextInt();
            switch (a) {
                case 1: System.out.print("Enter the number : ");        
                        int x = sc.nextInt();
                        push(s,x);
                        break;

                case 2: pop(s);;
                        break;

                case 3: System.out.print("Enter the index : ");
                        int i = sc.nextInt();
                        peep(s,i);
                        break;

                case 4: System.out.print("Enter the index : ");
                        int p = sc.nextInt();
                        System.out.print("Enter the number : ");
                        int q = sc.nextInt();
                        change(s, p, q);
                        break;
                
                case 5: break;
            }
            System.out.println(Arrays.toString(s));
        }

    }

    static void push(int[] arr, int x){
        if(top>arr.length-1)
        System.out.println("Overflow");
        else
        arr[++top]=x;
    }

    static void pop(int[] arr){
        if(top<0)
        System.out.println("Underflow");
        else{
            System.out.println(arr[top]);
            arr[top]=0;
            top--;
        }
    }

    static void peep(int[] arr,int i){
        System.out.println(arr[top-i+1]);
    }

    static void change(int[] arr,int i,int x){
        arr[top-i+1]=x;
    }
}
