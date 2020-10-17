package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

  public List<String> commonChars(String[] A) {
    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
    ArrayList<Character> arr = new ArrayList<Character>();
    for (char i : A[0].toCharArray()) {
      if (map1.containsKey(i)) {
        map1.put(i, map1.get(i) + 1);
      } else {
        map1.put(i, 1);
      }
    }
    for (int h = 1; h < A.length; h++) {
      for (char i : A[h].toCharArray()) {
        if (map2.containsKey(i)) {
          map2.put(i, map2.get(i) + 1);
        } else {
          map2.put(i, 1);
        }
      }
      for (char i : map2.keySet()) {
        if (map1.containsKey(i)) {
          int x = Math.min(map2.get(i), map1.get(i));
          map1.put(i, x);
        }
      }
      for (char i : map1.keySet()) {
        if (!map2.containsKey(i)) {
          arr.add(i);
        }
      }
      for (char t : arr) {
        map1.remove(t);
      }
      map2.clear();
    }
    ArrayList<String> array = new ArrayList<String>();
    for (char k : map1.keySet()) {
      for (int i = 0; i < map1.get(k); i++) {
        array.add(Character.toString(k));
      }
    }
    return array;
  }
}