public class assignment2 {
    public static void main(String[] args) {
        MathOps objMathOps = new MathOps();
        objMathOps.multipilication(15,5);
    }
}

class MathOps{
    public void addition(int a, int b){
        System.out.println(a+b);
    }

    public void subtraction(int a, int b){
        System.out.println(a-b);
    }

    public void multipilication(int a, int b){
        System.out.println(a*b);
    }

    public void division(int a, int b){
        System.out.println(a/b);
    }

    public void modulus(int a,int b){
        System.out.println(a%b);
    }
}
