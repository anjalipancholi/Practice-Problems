package HashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

  public int numIdenticalPairs(int[] nums) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        count++;
      } else {
        map.put(nums[i], map.getOrDefault(nums[i], +1));
      }
    }
    return count;
  }
}

