package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 791. Custom Sort String
 */
public class SortString {
    public String customSortString(String S, String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) (str.charAt(i) - 'a');
            arr[ch]++;
        }
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            int ch = (S.charAt(i) - 'a');
            while (arr[ch] > 0) {
                char c = (char) (ch + 'a');
                ans += c;
                arr[ch]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (arr[i] != 0) {
                char c = (char) (i + 'a');
                ans += c;

                arr[i]--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SortString().customSortString("", ""));
    }
}
