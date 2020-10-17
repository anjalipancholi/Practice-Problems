package array;

public class MaximumConsecutiveOnes {

  public static void main(String[] args) {
    new MaximumConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
  }

  public int findMaxConsecutiveOnes(int[] nums) {

    int temp = 0;
    int count = 0;
    int result = 0;
    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        count++;

        if (count > temp) {
          temp = count;
          result = temp;
        }
      } else {
        count = 0;
      }

    }

    return result;


  }
}
