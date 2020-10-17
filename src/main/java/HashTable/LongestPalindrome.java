package HashTable;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

  public int longestPalindrome(String s) {
    List<Character> l = new ArrayList<>();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (l.contains(ch)) {
        l.remove(ch);
        count += 2;
      } else {
        l.add(ch);
      }
    }
    if (!l.isEmpty()) {
      count++;
    }
    return count;
  }
}


