import java.util.Scanner;

public class createwords {
    public static void main(String[] args) {
        //1985A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[][] s1 = new String[t][2];
        String[][] s2 = new String[t][2];

        for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<2; j++){
                s1[i][j] = sc.next();
            }
        }

        for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<2; j++){
                s2[i][0] = s1[i][1].charAt(0)+s1[i][0].substring(1);
                s2[i][1] = s1[i][0].charAt(0)+s1[i][1].substring(1);
            }
        }

        for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<2; j++){
                System.out.print(s2[i][j] + " ");
            }
            System.out.println();
        }

        

        /*for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<2; j++){
                System.out.print(s1[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
