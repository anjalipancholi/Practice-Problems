package string;

public class SplitAStringInBalancedStrings {

  public int balancedStringSplit(String s) {
    int count = 0;
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'L') {
        count++;
      } else {
        count--;
      }
      if (count == 0) {
        result++;
      }
    }
    return result;
  }
}
