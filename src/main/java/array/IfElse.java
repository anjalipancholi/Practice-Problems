package array;

import java.util.Scanner;

public class IfElse {

    private static String ifElse(int n) {
        if (n >= 0 && n <= 25) {
            return ("First quartile");
        } else if (n > 25 && n <= 50) {
            return("Second quartile");
        } else if (n > 50 && n <= 75) {
            return ("Third quartile");
        } else {
            return ("Fourth quartile");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ifElse(n));
    }
}

