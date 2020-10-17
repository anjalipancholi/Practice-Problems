package HashTable;

import java.util.HashMap;

public class WordPattern {

  //Method 1
  public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    HashMap<Character, String> map = new HashMap();
    for (int i = 0; i < pattern.length(); i++) {
      if (!map.containsKey(pattern.charAt(i))) {
        if (map.containsValue(words[i])) {
          return false;
        }
        map.put(pattern.charAt(i), words[i]);
      } else {
        if (!map.get(pattern.charAt(i)).equals(words[i])) {
          return false;
        }
      }
    }
    return true;
  }


  //Method2
  public boolean WordPattern(String pattern, String str) {
    HashMap map_index = new HashMap();
    String[] words = str.split(" ");

    if (words.length != pattern.length()) {
      return false;
    }

    for (Integer i = 0; i < words.length; i++) {
      char c = pattern.charAt(i);
      String w = words[i];

      if (!map_index.containsKey(c)) {
        map_index.put(c, i);
      }

      if (!map_index.containsKey(w)) {
        map_index.put(w, i);
      }

      if (map_index.get(c) != map_index.get(w)) {
        return false;
      }
    }

    return true;
  }
}
