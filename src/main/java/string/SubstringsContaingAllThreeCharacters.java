package string;

import java.util.Arrays;

public class SubstringsContaingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int res = 0, i = 0, j = 0, a = 0, b = 0, c = 0;
        char[] strs = s.toCharArray();
        while (j < s.length()) {
            if (strs[j] == 'a') {
                a++;
            } else if (strs[j] == 'b') {
                b++;
            } else {
                c++;
            }
            while (a > 0 && b > 0 && c > 0) {
                res += (s.length() - j);
                if (strs[i] == 'a') {
                    a--;
                } else if (strs[i] == 'b') {
                    b--;
                } else {
                    c--;
                }
                i++;
            }
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SubstringsContaingAllThreeCharacters().numberOfSubstrings("abcabc"));
    }
}
