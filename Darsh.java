import java.util.Scanner;

public class Darsh {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int n = sc.nextInt();
        
        String[] arr = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        n = n%12;
        
        for(int i = 0; i<12; i++){
            if(arr[i].equals(month)){
                if((n+i)>12){
                    System.out.println(arr[n+i-12]);
                } else {
                    System.out.println(arr[n+i]);
                }
            }
        }
        final StringBuffer str = new StringBuffer("Sachin");
        str.append(" Tendulkar");
        System.out.println(str);
    }
}
