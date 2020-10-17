package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    for (String s : A.split(" ")) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    for (String s : B.split(" ")) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        result.add(entry.getKey());
      }
    }
    String[] ans = new String[result.size()];
    return result.toArray(ans);
  }
}
