public class revStack {
    static int top=4;
    static int[] arr={10,20,30,40,50};
    public static void main(String[] args) {
        reverse(top);
        System.out.println(top);
    }

    static void reverse(int top){
        int x = pop();
        
    }
    
    static void push(int x){
        if(top>arr.length-1)
        System.out.println("Overflow");
        else
        arr[++top]=x;
    }

    static int pop(){
        if(top<0)
        return 0;
        else
        return arr[top--];
    }   
}
