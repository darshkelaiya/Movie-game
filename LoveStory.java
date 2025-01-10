import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = "codeforces";
       
        String[] arr = new String[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }


        for(int i = 0; i<n; i++){
            int c = 0;
            for(int j = 0; j<10; j++){
                char c1 = s.charAt(j);
                char c2 = arr[i].charAt(j);
                if(c1!=c2){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
