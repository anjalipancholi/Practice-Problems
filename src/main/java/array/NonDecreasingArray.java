package array;

public class NonDecreasingArray {

  public static void main(String[] args) {
    new NonDecreasingArray().checkPossibility(new int[]{4, 2, 1, 3});
  }

  public boolean checkPossibility(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        if (i > 0) {
          if (nums[i - 1] <= nums[i + 1]) {
            nums[i] = nums[i - 1];
          } else {
            nums[i + 1] = nums[i];
          }
        }
        count++;
        if (count > 1) {
          return false;
        }
      }
    }
    return true;
  }
}
