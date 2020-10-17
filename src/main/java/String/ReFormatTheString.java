package String;

import java.util.ArrayList;
import java.util.List;

public class ReFormatTheString {
    public String reformat(String s) {
        if (s.length() == 1) {
            return s;
        }
        //to separate letters and digits
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letter.append(c);
            } else {
                digit.append(c);
            }
        }
        //if string not inclued letters or digits return "";
        int diff1 = digit.length() - letter.length();
        int diff2 = letter.length() - digit.length();
        if (letter.length() == 0 || digit.length() == 0 || diff1 >= 2 || diff2 >= 2) {
            return "";
        }
        //to reformat string;
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < letter.length() && j < digit.length()) {
            result.append(letter.charAt(i));
            result.append(digit.charAt(j));
            i++;
            j++;
        }
        // if letter length greater than digit length equals 1;
        if (letter.length() - i == 1) {
            result.append(letter.charAt(letter.length() - 1));
        }
        // if digit length greater than letter length equals 1;
        if (digit.length() - j == 1) {
            result.insert(0, digit.charAt(digit.length() - 1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        new ReFormatTheString().reformat("abc12d3");
    }
}

