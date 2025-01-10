public class code {
    public static void main(String[] args){ 
        Check one = new Check(); 
        one.method("NAMO");
 }
}
       //And the class Check is as follows -
        class Check{
    void method(String s1)
    {
        method(s1, s1+s1);
    }
    void method(String s1, String s2)
    {
        method(s1, s2, s1+s2);
    } 
    void method(String s1, String s2, String s3)
    {
        System.out.println(s1+s2+s3);
    }
}


