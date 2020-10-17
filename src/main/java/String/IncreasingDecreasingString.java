package String;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        int[] frequency = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        while (sb.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (frequency[i] > 0) {
                    sb.append((char)(i + 97));
                    frequency[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (frequency[i] > 0) {
                    sb.append((char)(i + 97));
                    frequency[i]--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new IncreasingDecreasingString().sortString("abczz");
    }
}
