import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[2*t][2];
        int[][] diff = new int[t][2];

        for(int i =0; i<2*t; i++){
            for(int j = 0; j<2; j++){
                arr[i][j]  = sc.nextInt();
            }
        }

        for(int i =0; i<2*t; i++){
            for(int j = 0; j<2; j++){
                if(i%2!=0){
                    diff[i][j] = arr[i+1][j]-arr[i][j];
                }
            }
        }
    }
}
