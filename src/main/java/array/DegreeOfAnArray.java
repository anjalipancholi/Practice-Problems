package array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

//Java program to find the most frequent element
//in an array


  public static void main(String[] args) {
    new DegreeOfAnArray().mostFrequent(new int[]{1, 2, 2, 3, 1});
  }

  public int mostFrequent(int[] nums) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int key = nums[i];
      if (map.containsKey(key)) {
        int freq = map.get(key);
        freq++;
        map.put(key, freq);
      } else {
        map.put(key, 1);
      }
    }

    int max_count = 0;
    int res = 0;
    int count = 0;
    for (Map.Entry<Integer, Integer> value : map.entrySet()) {
      if (max_count < value.getValue()) {
        res = value.getKey();
        max_count = value.getValue();
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != res) {
        count++;
      } else {
        break;
      }
    }

    for (int j = nums.length - 1; j >= 0; j--) {

      if (nums[j] != res) {
        count++;
      } else {
        break;
      }
    }

    int counts = nums.length - count;

    System.out.println(counts);
    return counts;
  }

}
