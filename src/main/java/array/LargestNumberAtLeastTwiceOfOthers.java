package array;

public class LargestNumberAtLeastTwiceOfOthers {

  public static void main(String[] args) {
    new LargestNumberAtLeastTwiceOfOthers().dominantIndex(new int[]{1, 2, 6, 3});
  }

  public int dominantIndex(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[max]) {
        max = i;
      }
    }
    for (int j = 0; j < nums.length; j++) {
      if (max != j && nums[max] < 2 * nums[j]) {
        return -1;
      }
    }
    return max;
  }
}
