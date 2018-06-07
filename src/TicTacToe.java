import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        boolean retry = false;
        int ppkd[] = new int[9];
        int cpkd[] = new int[9];

        System.out.println("Welcome to Tic Tac Toe. Player is X, computer is O");
        System.out.println("This is a new game. Board numbers are as follows:");
//        for(int i = 1; i < 10 ; i+=3) {
//            System.out.println(i + "\t|\t" + (i+1) + "\t|\t" + (i+2));
//        }
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "\t|\t");
            if (i % 3 == 0) System.out.println("");
        }

        Scanner in = new Scanner(System.in);
        while (!retry) {
            System.out.println("Enter your desired location: ");
            try {
                int x = in.nextInt();
                if (x < 1 || x > 9) {
                    throw new InputMismatchException("Enter an integer between 1 and 9.");
                } else {
                    retry = true;
                    System.out.println("Location accepted.");
                    ppkd[0] = x;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Enter an integer between 1 and 9.");
                in.next();
            }

            for (int i = 1; i < 10; i++) {
                if(i==ppkd[0])
                    System.out.print("X" + "\t|\t");
                else
//                    System.out.print(i + "\t|\t");
                    System.out.print("\t|\t");
                if (i % 3 == 0) System.out.println("");
            }
        }
    }
//
//    public static int CompPick(int n) {
//
//
//    }

    public static boolean Winner(int[] pkd) {
        boolean w = false;

        for(int i = 0; i < pkd.length-3; i++) {
            if (pkd[i] == pkd[i + 1] && pkd[i + 1] == pkd[i + 2])
                w = true;
        }
        for(int i = 0; i < pkd.length-4; i++) {
            if (pkd[i] == pkd[i + 3] && pkd[i + 3] == pkd[i + 6])
                w = true;
        }
        for(int i = 0; i < pkd.length-5; i++) {
            if (pkd[i] == pkd[i+4] && pkd[i+4] == pkd[i+8])
                w = true;
        }

        return w;
    }
}
