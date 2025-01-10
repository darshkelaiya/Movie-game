import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s1 = "1 0 1";
        String s2 = "1 1 0";
        String s3 = "0 1 1";
        String s4 = "1 1 1 ";
        int c = 0; 
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
            if(arr[i].equals(s1) || arr[i].equals(s2) || arr[i].equals(s3) || arr[i].equals(s4)){
                c++;
            }
        }

        System.out.println(c);


    }
}
