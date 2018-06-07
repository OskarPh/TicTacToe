import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.lang.StrictMath;
import java.io.File;

import static java.lang.StrictMath.floor;
import static java.lang.StrictMath.round;

public class Hello {
    public static void main(String[] argsO) {
//        System.out.println("Hello\n User!");
//        System.out.println(36+74);
//        System.out.println(50/3);
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55+9) % 9);
//        System.out.println(20 + -3*5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input first integer: ");
//        int n1 = in.nextInt();
//        System.out.print("Input second integer: ");
//        int n2 = in.nextInt();
//        System.out.println(n1 + " + " + n2 + " = " + n1+n2);
//        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
//        System.out.println(n1 + " x " + n2 + " = " + n1*n2);
//        System.out.println(n1 + " / " + n2 + " = " + n1/n2);
//        System.out.println(n1 + " mod " + n2 + " = " + n1%n2);
//        for(int i=1; i<=10; i++) {
//            System.out.println(n1 + " x " + i + " = " + (n1*i));
//        }
//        System.out.println("Result " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//        System.out.println("Result 2 " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the radius: ");
//        double r = in.nextDouble();
//        System.out.println("Perimeter is " + (2*r*Math.PI));
//        System.out.println("Area is " + (r*r*Math.PI));
//        Scanner in = new Scanner(System.in);
//        System.out.println("Gimme da width ");
//        int n1 = in.nextInt();
//        System.out.println("Gimme da height ");
//        int n2 = in.nextInt();
//        System.out.println("Area is  " + (n1*n2));
//        System.out.println("Perimeter is " + 2*(n1+n2));
//        int n1 = 2;
//        int n2 = 3;
//        int n3;
//        System.out.println(n1 + " and " + n2);
//        n3 = n1;
//        n1 = n2;
//        n2 = n3;
//        System.out.println(n1 + " and " + n2);
//        System.out.println("\nJava Version: "+System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: "+System.getProperty("java.home"));
//        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a string ");
////        long n1 = in.nextLong();
////        System.out.println("Sum of digits " + SumDigits(n1));
////    }
////    public static int SumDigits(long a) {
////            int sum = 0;
////            while (a !=0){
////                sum += a % 10;
////                a /= 10;
////            }
////            return sum;
////        }
////        char[] letters = in.nextLine().toCharArray();
////        for(int i = letters.length - 1; i >= 0; i--) {
////            System.out.print(letters[i]);
////        }
//        String test = in.nextLine();
//        count(test);
//    }
//    public static void count(String x) {
//        char[] ch = x.toCharArray();
//        int letter = 0;
//        int space = 0;
//        int num = 0;
//        int other = 0;
//        for(int i = 0; i < ch.length; i++) {
//            if(Character.isLetter(ch[i])) {
//                letter++;
//            } else if(Character.isDigit(ch[i])) {
//                num++;
//            } else if(Character.isWhitespace(ch[i])) {
//                space++;
//            } else { other++; }
//        }
//        System.out.println("The string is : " + x);
//        System.out.println("letter: " + letter);
//        System.out.println("space: " + space);
//        System.out.println("number: " + num);
//        System.out.println("other: " + other);
//        int i = 1;
//        int amount = 0;
//        for(i=1; i < 5; i++) {
//            for(int j=1; j<5; j++) {
//                for(int k=1; k<5; k++){
//                    if(k!=j && j!=i) {
//                        amount++;
//                        System.out.println(i + "" + j + "" + k);
//
//                    }
//                }
//            }
//        }
//        System.out.println("Total number of unique three-digit-number is " + amount);
//        System.out.println("Twinkle, twinkle, little star,\n" +
//                "\tHow I wonder what you are!\n" +
//                "\t\tUp above the world so high,\n" +
//                "\t\tLike a diamond in the sky.\n" +
//                "Twinkle, twinkle, little star,\n" +
//                "\tHow I wonder what you are");
//        System.out.println("Input your integer ");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println("Result: " + n*(1+n+n*n));
//        for(int i = 1; i < 100; i++) {
//            if(i%2!=0) {
//                System.out.println(i);
//            }
//        }
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int n1 = in.nextInt();
//        System.out.println("Inpur the second number: ");
//        int n2 = in.nextInt();
//        System.out.println("Input the third number: ");
//        int n3 = in.nextInt();
//        String result = "false";
//        if(n3 == n1+n2) {
//            result = "true";
//        } else {
//            result = "false";
//        }
//        System.out.println("The result is: " + result);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input seconds: ");
//        double n = in.nextDouble();
//        double h = floor(n/3600);
//        double m = floor((n - h*3600)/60);
//        double s = floor(n%60);
//        System.out.printf("%d:%d:%d", (int) h,(int) m,(int) s);
//        int seconds = in.nextInt();
//        int p1 = seconds % 60;
//        int p2 = seconds / 60;
//        int p3 = p2 % 60;
//        p2 = p2 / 60;
//        System.out.print( p2 + ":" + p3 + ":" + p1);
//        System.out.print("\n");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int x = in.nextInt();
//        System.out.println("Input second number: ");
//        int y = in.nextInt();
//        System.out.println("Input third number: ");
//        int p = in.nextInt();
//        int c = 0;
//        for(int i = x; i <= y; i++) {
//            if(i%p==0) c++;
//        }
//        System.out.print("Result " + c);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int x = in.nextInt();
//        int c = 0;
//        for(int i = 1; i <= x; i++) {
//            if(x%i==0) c++;
//        }
//        System.out.println(c);
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input an integer: ");
//        int x = in.nextInt();
//
//        System.out.println("Result " + result(x));
//    }
//    public static int result(int num) {
//        int ctr = 0;
//        System.out.println((int)Math.sqrt(num));
//        for(int i=1; i<=(int)Math.sqrt(num); i++) {
//            System.out.println(i);
//            if(num%i==0 && i*i!=num) {
//                ctr+=2;
//            } else if (i*i==num) {
//                ctr++;
//            }
//        }
//        return ctr;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a Sentence: ");
//        String line = in.nextLine();
//        String upper_case_line = "";
//        Scanner lineScan = new Scanner(line);
//        while(lineScan.hasNext()) {
//            String word = lineScan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
//        }
//        System.out.println(upper_case_line.trim());
//        Scanner in = new Scanner(System.in);
//        System.out.print("\nInput a word: ");
//        String word = in.nextLine();
//        word = word.trim();
//        String result = "";
//        char[] ch=word.toCharArray();
//        for (int i = ch.length - 1; i >= 0; i--) {
//            result += ch[i];
//        }
//        System.out.println("Reverse word: " + result.trim());
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        int x = in.nextInt();
//        System.out.print("Input the second number: ");
//        int y = in.nextInt();
//        System.out.println("Result: " + kalk(x,y));
//    }
//    public static int kalk(int a, int b) {
//        if(a==b) return 0;
//        if(a%6==b%6) return Math.min(a,b);
//        return Math.max(a,b);
//
//    }
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        int x = in.nextInt();
//        System.out.print("Input the second number: ");
//        int y = in.nextInt();
//        System.out.println("Result " + (x-y*round(x/y)) + " or " + x%y);
//        String p = "Python 3.0";
//        String re = p.substring(p.length()-3) + p.substring(p.length()-3) + p.substring(p.length()-3) + p.substring(p.length()-3);
//        System.out.println(re);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first string ");
//        String e = in.nextLine();
//        System.out.println("Input second string ");
//        String f = in.nextLine();
//        String sub = "#";
//        if(e.length()<3) String g = StringUtils.
//                (3-e.length());
//        System.out.println(re);
//        System.out.println(new String("abc").equals("abc"));
//
//        System.out.println(new String("abc") == "abc");
//
//        System.out.println(new String("abc") == new String("abc"));
//
//        System.out.println("abc" == "abc");
//        int[] ar = { 50, -20, 0, 30, 40, 60, 12};
//        int[] br = {45, 20, 10, 20, 30, 50, 11};
//        int cr[] = new int[2];
//        cr[0] = ar[0];
//        cr[1] = br[br.length-1];
//        System.out.println(Arrays.toString(cr));
//        System.out.println(cr[1]);
//        int[] ar = {1, 3, -5, 4};
//        int[] br = { 1,4,-5,-2};
//        int[] cr = new int[4];
//        for(int i = 0; i < ar.length; i++) {
//            cr[i] = ar[i]*br[i];
//        }
//        System.out.println(Arrays.toString(cr));
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input string ");
//        String l = in.nextLine();
//        System.out.println(l.substring(l.length()-3)+l+l.substring((l.length()-3)));
//        System.out.println(l.startsWith(""));
        int i = 1;
        System.out.println("i instance of int " + (Integer.class.isInstance(i)));
        int n = (i = 1);
        System.out.println(n);

        test subj = new test(5, 6);
        subj.prtn();
    }
}

class test {
    int a;
    int b;

    test(int a, int b) {
        this.a = b;
        this.b = a;
    }

    private test() {
    }

    ;

    public void prtn() {
        System.out.println(" a " + a + " b " + b);
    }
}