public class dupChar {
    public static void main(String[] args) {
        String str = "double trouble";

        for(int i = 0; i<str.length(); i++){
            int c = 0;
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j))
                c++;
            }
            if(c>=1){
                System.out.println(str.charAt(i));
            }
        }
    }
}
