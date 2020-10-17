package array;

public class LongestContinuousIncreasingSubsequence {

  public static void main(String[] args) {
    new LongestContinuousIncreasingSubsequence().findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
  }

  public int findLengthOfLCIS(int[] nums) {

    int count = 1;
    int max = 0;
    for (int i = 1; i < nums.length; i++) {

      for (int j = i; j < nums.length; j++) {
        if (nums[j - 1] < nums[j]) {
          count++;
        }
        if (count > max) {
          max = count;
        } else {
          break;
        }
      }
      count = 1;
    }
    System.out.println(max);
    return max;
  }
}
