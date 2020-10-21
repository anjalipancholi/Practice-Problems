package string;

/**
 * 647. Palindromic Substrings
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int minus = i, plus = i;
            while (minus >= 0 && plus < s.length()) {
                if (s.charAt(minus) == s.charAt(plus)) {
                    count++;
                    minus--;
                    plus++;
                } else {
                    break;
                }
            }
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                int m = i, p = i + 1;
                while (m >= 0 && p < s.length()) {
                    if (s.charAt(m) == s.charAt(p)) {
                        count++;
                        m--;
                        p++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromicSubstrings().countSubstrings("aaa"));
    }
}
