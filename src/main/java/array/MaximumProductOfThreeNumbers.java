package array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

  public static void main(String[] args) {
    new MaximumProductOfThreeNumbers().maximumProduct(new int[]{1, 2, 3});
  }

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int last = nums[nums.length - 1];
    int sec_last = nums[nums.length - 2];
    int third_last = nums[nums.length - 3];
    int product = last * sec_last * third_last;

    return product;
  }
}

