package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

  public String mostCommonWord(String paragraph, String[] banned) {
    String p = paragraph.trim().toLowerCase().replaceAll("[^a-zA-Z]", " ");
    String[] words = p.split("\\s+");
    Map<String, Integer> map = new HashMap<>();
    int max = 0;
    String ans = "";
    for (String word : words) {
      if (!Arrays.asList(banned).contains(word)) {
        int count = map.getOrDefault(word, 0) + 1;
        map.put(word, count);
        if (count > max) {
          max = count;
          ans = word;
        }
      }
    }
    return ans;
  }
}
