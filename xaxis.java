import java.util.Scanner;

public class xaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] x1 = new int[t];
        int[] x2 = new int[t];
        int[] x3 = new int[t];
        int[] max = new int[t];
        int[] min = new int[t];
        int[] sum = new int[t];

        for(int i = 0; i<t; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            x3[i] = sc.nextInt();
            if(x1[i]>=x2[i] && x1[i]>=x3[i]){
                max[i] = x1[i];
            } 
            if(x2[i]>=x1[i] && x2[i]>=x3[i]){
                max[i] = x2[i];
            } 
            if(x3[i]>=x2[i] && x3[i]>=x1[i]){
                max[i] = x3[i];
            }
            if(x1[i]<=x2[i] && x1[i]<=x3[i]){
                min[i] = x1[i];
            } 
            if(x2[i]<=x1[i] && x2[i]<=x3[i]){
                min[i] = x2[i];
            } 
            if(x3[i]<=x2[i] && x3[i]<=x1[i]){
                min[i] = x3[i];
            }
            sum[i] = max[i] - min[i];
            System.out.println(sum[i]);     
        }
        
        
    }

}
