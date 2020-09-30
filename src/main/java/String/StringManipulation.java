package String;

import java.util.Scanner;

public class StringManipulation {
    public static String stringmanipulation(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) +
                        1 - 65) % 26 + 65);
                result += ch;
            } else {
                char ch = (char) (((int) s.charAt(i) +
                        1 - 97) % 26 + 97);
                result += ch;
            }
        }
        return result;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        String ans = stringmanipulation(s);
        System.out.println(ans);
    }
}
