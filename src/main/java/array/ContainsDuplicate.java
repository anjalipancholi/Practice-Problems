package array;

import java.util.Arrays;


public class ContainsDuplicate {

  public static void main(String[] args) {
    new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1});

  }

  public boolean containsDuplicate(int[] nums) {

    //after sorting same integers will be adjacent each together
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }


    }

    return false;
  }
}
