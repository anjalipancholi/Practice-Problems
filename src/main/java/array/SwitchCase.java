package array;

import java.util.Scanner;

public class SwitchCase {
    private static String switchCase(int m, int[] arr) {
        int i = 0;
        while (i < arr.length) {
            switch (arr[i]) {
                case 0:
                    System.out.println("Zero");
                    return ("Zero");
                case 1:
                    return ("One");
                case 2:
                    return ("Two");
                case 3:
                    return ("Three");
                case 4:
                    return ("Four");
                case 5:
                    System.out.println("Five");
                    return ("Five");
                case 6:
                    return ("Six");
                case 7:
                    return ("Seven");
                case 8:
                    return ("Eight");
                case 9:
                    return ("Nine");
            }
            i++;
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++)
            arr[i] = sc.nextInt();

        String res = switchCase(m, arr);

        System.out.println(res);
    }
}
