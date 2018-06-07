import java.util.InputMismatchException;
import java.util.Scanner;

public class TTT2 {

    enum State{Blank, X, O};
    int n;
    State[][] board = new State[3][3];
    int moveCount;

    public static void main(String[] args) {

        int[][] t = { {1,2,3}, {4,5,6}, {7,8,9}};

        int x = 0;
        boolean retry = false;
        int ppkd[] = new int[9];
        int cpkd[] = new int[9];

        System.out.println("Welcome to Tic Tac Toe. Player is X, computer is O");
        System.out.println("This is a new game. Board numbers are as follows:");
//        for(int i = 1; i < 10 ; i+=3) {
//            System.out.println(i + "\t|\t" + (i+1) + "\t|\t" + (i+2));
//        }
        for(int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "\t|\t");
            }
            System.out.println("");
        }
        x = Player();
        System.out.println(x);
        for(int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(t[i][j]==x)
                    System.out.print("X" + "\t|\t");
                else
                    System.out.print("\t|\t");
            }
            System.out.println("");
        }
    }

    public static int Player() {
        boolean retry = false;
        int x = 0;
        Scanner in = new Scanner(System.in);
        while (!retry) {
            System.out.println("Enter your desired location: ");
            try {
                x = in.nextInt();
                if (x < 1 || x > 9) {
                    throw new InputMismatchException("Enter an integer between 1 and 9.");
                } else {
                    retry = true;
                    System.out.println("Location accepted.");
                    return x;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer between 1 and 9.");
                in.next();
            }
        }
        return x;
    }

    void Winner(int x, int y, State s) {
            if(board[x][y] == State.Blank){
                board[x][y] = s;
            }
            moveCount++;

            //check end conditions

            //check col
            for(int i = 0; i < n; i++){
                if(board[x][i] != s)
                    break;
                if(i == n-1){
                    //report win for s
                }
            }

            //check row
            for(int i = 0; i < n; i++){
                if(board[i][y] != s)
                    break;
                if(i == n-1){
                    //report win for s
                }
            }

            //check diag
            if(x == y){
                //we're on a diagonal
                for(int i = 0; i < n; i++){
                    if(board[i][i] != s)
                        break;
                    if(i == n-1){
                        //report win for s
                    }
                }
            }

            //check anti diag (thanks rampion)
            if(x + y == n - 1){
                for(int i = 0; i < n; i++){
                    if(board[i][(n-1)-i] != s)
                        break;
                    if(i == n-1){
                        //report win for s
                    }
                }
            }

            //check draw
            if(moveCount == (Math.pow(n, 2) - 1)) {
                //report draw
            }
    }
}
