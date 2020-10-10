package String;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int n = str2.length();
        while (n >= 1) {
            {
                if (str1.length() % n == 0 && str2.length() % n == 0) {
                    String gcd = str2.substring(0, n);
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 0; i < str1.length() / n; i++) {
                        sb1.append(gcd);
                    }
                    for (int i = 0; i < str2.length() / n; i++) {
                        sb2.append(gcd);
                    }
                    if (sb1.toString().equals(str1) && sb2.toString().equals(str2)) {
                        return gcd;
                    }
                }
            }
            n--;
        }
        return "";
    }
}
