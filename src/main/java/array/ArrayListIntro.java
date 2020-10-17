package array;

import java.util.Scanner;

public class ArrayListIntro {
    public static int numberOfMinutes(int n) {
       int result =0;
       if(n % 2 ==0) {
           result = n/2;
       }else {
           result = n/2 +1;
       }
       return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = numberOfMinutes(n);
        System.out.print(result);
    }
}


