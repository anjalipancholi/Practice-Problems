package string;

public class maxPower {

  public int maxPower(String s) {
    int count = 0;
    int maxCount = 0;
    char previous = ' ';
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (previous == c) {
        count++;
      } else {
        count = 1;
        previous = c;
      }
      maxCount = Math.max(count, maxCount);
    }
    return maxCount;
  }
}
