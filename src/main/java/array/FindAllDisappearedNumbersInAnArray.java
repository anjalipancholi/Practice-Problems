package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDisappearedNumbersInAnArray {

  public static void main(String[] args) {
    new FindAllDisappearedNumbersInAnArray()
        .findDisappearedNumbers(new int[]{1, 2, 4, 3, 7, 1, 8, 2});

  }

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      set.add(i);
    }
    for (int i = 1; i <= nums.length; i++) {
      if (!set.contains(i)) {
        list.add(i);
      }
    }

    return list;

  }
}


