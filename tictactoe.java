import java.util.Arrays;
import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        
        char a = '_';
        do {
        char[][] arr = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        boolean play = true;

        while (play) {
            System.out.print("Enter row number for X: ");
            int x = sc.nextInt();
            System.out.print("Enter column number for X: ");
            int y = sc.nextInt();
            arr[x][y] = 'X';

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j]);
                    if(j<2)
                    System.out.print("|");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(arr[i][j]=='_'){
                        play = true;
                        break;
                    }else
                    play = false;
                }
                if(play==true)
                break;
            }

            if(play==false){
                System.out.println("It's a draw!");
                break;
            }

            for (int i = 0; i < 3; i++) {
                if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2] && arr[i][0]!='_'){
                    play = false;
                }
            }
            for (int j = 0; j < 3; j++) {
                if(arr[0][j]==arr[1][j] && arr[0][j]==arr[2][j] && arr[0][j]!='_'){
                    play = false;
                }
            }
            if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] && arr[0][0]!='_')
            play = false;

            if(arr[0][2]==arr[1][1] && arr[2][0]==arr[1][1] && arr[1][1]!='_')
            play = false;

            if(play==false){
            System.out.println("Player - 1 wins!");
            break;
            }

            System.out.print("Enter row number for O: ");
            int p = sc.nextInt();
            System.out.print("Enter column number for O: ");
            int q = sc.nextInt();
            arr[p][q] = 'O';

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j]);
                    if(j<2)
                    System.out.print("|");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(arr[i][j]=='_'){
                        play = true;
                        break;
                    }else
                    play = false;
                }
                if(play==true)
                break;
            }

            if(play==false)
            break;

            for (int i = 0; i < 3; i++) {
                if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2] && arr[i][0]!='_'){
                    play = false;
                }
            }
            for (int j = 0; j < 3; j++) {
                if(arr[0][j]==arr[1][j] && arr[0][j]==arr[2][j] && arr[0][j]!='_'){
                    play = false;
                }
            }
            if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] && arr[0][0]!='_')
            play = false;

            if(arr[0][2]==arr[1][1] && arr[2][0]==arr[1][1] && arr[1][1]!='_')
            play = false;

            if(play==false){
                System.out.println("Player - 2 wins!");
                break;
            }
        }
        System.out.print("Want to play again? Enter y if yes : ");
        a = sc.next().charAt(0);

        } while (a=='y');
    }
}
