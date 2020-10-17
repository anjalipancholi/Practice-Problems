package array;

public class FindPivotIndex {

  public static void main(String[] args) {
    new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 6, 5});
  }

  public int pivotIndex(int[] nums) {
    int i = 0;
    int j = nums.length - 1;
    int sum1 = 0;
    int sum2 = 0;
    while (i < nums.length && j >= 0) {
      sum1 += nums[i];
      sum2 += nums[j];
      if (sum1 == sum2) {
        i++;
        j--;
      } else {
        break;
      }
    }
    System.out.println(i);
    return i;

  }


}

