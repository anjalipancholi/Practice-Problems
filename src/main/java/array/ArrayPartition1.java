package array;

import java.util.Arrays;


public class ArrayPartition1 {

  public static void main(String[] args) {
    new ArrayPartition1().arrayPairSum(new int[]{4, 3, 2, 1});
  }

  public int arrayPairSum(int[] nums) {

   Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i += 2) {
      sum = sum + nums[i];
    }
    return sum;

  }
}


