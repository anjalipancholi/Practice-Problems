package string;

/**
 * 1016. Binary String With Substrings Representing 1 To N
 */
public class BinaryStringWithSubstrings {
    public boolean queryString(String s, int n) {
        for (int i = n; i > n / 2; i--) {
            if (!s.contains(Integer.toBinaryString(i))) return false;
        }
        return true;
    }

    public static String convertToBinary(int x) {
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append((x & 1) == 0 ? '0' : '1');
            x = x >> 1;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        convertToBinary(10);
    }
}
