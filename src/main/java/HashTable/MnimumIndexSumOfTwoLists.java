package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MnimumIndexSumOfTwoLists {

  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
      map1.put(list1[i], i);
    }
    for (int i = 0; i < list2.length; i++) {
      if (map1.containsKey(list2[i])) {
        map2.put(list2[i], map1.get(list2[i]) + i);
      }
    }
    int min = Integer.MAX_VALUE;
    for (String k : map2.keySet()) {
      min = Math.min(min, map2.get(k));
    }
    List<String> list = new ArrayList<>();
    for (String k : map2.keySet()) {
      if (map2.get(k) == min) {
        list.add(k);
      }
    }
    String[] ans = new String[list.size()];
    int i = 0;
    for (String j : list) {
      ans[i] = j;
      i++;
    }
    return ans;
  }

}
