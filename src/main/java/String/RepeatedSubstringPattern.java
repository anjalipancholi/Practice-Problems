package String;

public class RepeatedSubstringPattern {

  public static void main(String[] args) {
    new RepeatedSubstringPattern().repeatedSubstringPattern("cabababababe");
  }

  public boolean repeatedSubstringPattern(String s) {
    for (int k = 1; k <= s.length() / 2; k++) {
      if (s.length() % k != 0) {
        continue;
      }
      int ok = 1;
      for (int i = k; i < s.length(); i++) {
        if (s.charAt(i) != s.charAt(i % k)) {
          ok = 0;
          break;
        }
      }
      if (ok == 1) {
        System.out.println(true);
      }
      if (ok == 1) {
        return true;
      }
    }
    System.out.println(false);
    return false;
  }
}
