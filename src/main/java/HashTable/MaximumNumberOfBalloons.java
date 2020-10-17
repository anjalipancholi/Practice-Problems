package HashTable;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

  public int maxNumberOfBalloons(String text) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('a', 0);
    map.put('b', 0);
    map.put('l', 0);
    map.put('o', 0);
    map.put('n', 0);
    for (int i = 0; i < text.length(); i++) {
      if (map.containsKey(text.charAt(i))) {
        map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
      }
    }
    return Math.min(Math.min(map.get('l'), map.get('o')) / 2,
        Math.min(map.get('b'), Math.min(map.get('a'), map.get('n'))));
  }
}
