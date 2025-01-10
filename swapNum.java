public class swapNum {
    public static void main(String[] args) {
        int a = 23;
        int b = 43;
        swap(a, b);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    static void swap(int a, int b){
        
        a = a+b;
        b = a-b;
        a = a-b;
    }
}
