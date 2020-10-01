package String;

public class RemovePalindromicSequences {
    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.equals(sb.reverse().toString())) {
            return 1;
        }
        return 2;
    }
}
