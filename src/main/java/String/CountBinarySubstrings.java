package String;

public class CountBinarySubstrings {

  public int countBinarySubstrings(String s) {
    int[] count = new int[s.length()];
    int j = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) == s.charAt(i)) {
        count[j++] = 1;
      } else {
        count[j]++;
      }
    }
    int result = 0;
    for (int i = 1; i <= j; i++) {
      result += Math.min(count[i - 1], count[i]);
    }
    return result;
  }
}
