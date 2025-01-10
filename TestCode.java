import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        String s = "abb";
        String x = "";
        for(int i = s.length()-1; i>=0; i--){
            x += s.charAt(i);
        }
        
        int start = 0;
        int end = s.length()-1;
        while(!s.contains(x.substring(start,end+1))){
            if(s.contains(x.substring(start+1,end+1))){
                start++;
            }
            else if(s.contains(x.substring(start,end))){
                end--;
            } else if(s.contains(x.substring(start+1,end))){
                start++;
                end--;
            }
        }
        System.out.println(x.substring(start,end+1)); 
    }
}
/*String num1 = "123";
        String num2 = "456";
        int n1 = 0;
        int n2 = 0;
        for(int i = num1.length()-1; i>=0; i--){
            int k = num1.charAt(i)-'0';
            n1 = n1 + exponent(k,num1.length()-i-1);
        }
        for(int i = num2.length()-1; i>=0; i--){
            int c = num2.charAt(i)-'0';
            n2 = n2 + exponent(c,num2.length()-i-1);
        }
        int n = n1*n2;
        StringBuilder res = new StringBuilder("");
        while(n>0){
            int temp = n%10;
            res = res.append((char)(temp+'0'));
            n = n/10;
        }
        System.out.println(res.reverse().toString());
 
    }

    public static int exponent(int n, int x){
        int a = 1;
        for(int i = 0; i<x; i++){
            a = a*10;
        }
        return a*n;
    } */


