package array;

public class MaximumAverageSubarray1 {

  public static void main(String[] args) {
    new MaximumAverageSubarray1().findMaxAverage(new int[]{1, 12, -5, 50, 4, 0}, 4);
  }

  public double findMaxAverage(int[] nums, int k) {

    double max = 1;
    for (int i = 0; i < nums.length; i++) {
      int sum = nums[i];
      for (int j = i + 1; j < i + k; j++) {
        if (j >= nums.length) {
          break;
        }
        sum = sum + nums[j];

      }
      double average = (double) sum / k;
      if (average > max) {
        max = average;
      }
    }
    return max;


  }
}



