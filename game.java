import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Wanna play a game?");
        System.out.println("Guess the movie name!");
                
        String[] arr = new String[10];
        char t = '_';
        int x = 1;

        arr[0] = "dil chahta hai";
        arr[1] = "kal ho na ho";
        arr[2] = "chak de india";
        arr[3] = "kabhi khushi kabhi ghum";
        arr[4] = "rock on";
        arr[5] = "zindagi na milegi dobara";
        arr[6] = "hera pheri";
        arr[7] = "kuch kuch hota hai";
        arr[8] = "jaane tu ya jaane na";
        arr[9] = "rang de basanti";

        do{
            x = 1;

        System.out.print("Choose a number between 0 and 9 : ");
        int n = sc.nextInt();

        while(n<0||n>9){
            System.out.print("Oops! invalid. Try again : ");
            n = sc.nextInt();
        }
        
        boolean count;
        StringBuffer h = new StringBuffer("BOLLYWOOD");
        int y = h.length();
        
        StringBuffer str = new StringBuffer(arr[n]);
        char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char c;

        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<consonants.length; j++){
                if(str.charAt(i)==consonants[j]){
                    str.setCharAt(i, '_');
                }
            }
        }
        System.out.println(str);

        while(str.toString().equals(arr[n].toString())==false){
            System.out.print("Enter a consonant to guess the movie : ");
            c = sc.next().charAt(0);
            count = false; 
            for(int i = 0; i<str.length(); i++){
                if(arr[n].charAt(i)==c){
                    str.setCharAt(i, c);
                    count = true;
                    for(int j = i+1; j<str.length(); j++){
                        if(arr[n].charAt(j)!=c){
                            break;
                        }
                    }
                } 
            }
            
            if(count==false){
                h.deleteCharAt(y-x);
                x++;
                System.out.println();
                System.out.println("Uh-oh! Incorrect, "+ (y-x+1) +" tries remaining");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Correct!");
                System.out.println();
            }
            if(x==10){
                System.out.println("Oops! You couldn't guess. It was "+arr[n]);
                break;
            } 
            System.out.println(h);
             
            System.out.println(str);
            
        }

        if(str.toString().equals(arr[n].toString())){
            System.out.println("Yay! you guessed it right");
        }
        System.out.println("Want to play again?");
        System.out.print("If yes enter y, else enter n : ");
        t = sc.next().charAt(0);

        //h = new StringBuffer("BOLLYWOOD");
    }while(t=='y');

    System.out.println("Thanks for playing! Hope you enjoyed");

    }
}
