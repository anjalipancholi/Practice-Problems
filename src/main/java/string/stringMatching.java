package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringMatching {

  public List<String> stringMatching(String[] words) {
    Set<String> set = new HashSet<>();
    for (String word : words) {
      for (String s : words) {
        if (!word.equals(s)) {
          if (word.contains(s)) {
            set.add(s);
          }
        }
      }
    }
    return new ArrayList<>(set);
  }
}
