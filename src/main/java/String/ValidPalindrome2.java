package String;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
        }
        System.out.println(true);
        return true;
    }

    private boolean isValid(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        new ValidPalindrome2().validPalindrome("abca");
    }
}
