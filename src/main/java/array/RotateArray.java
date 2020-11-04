package array;

// TODO : Do return order of N
public class RotateArray {

  public static void main(String[] args) {
    new RotateArray().rotate(new int[]{5, 7, 2, 4, 1, 2}, 3);
  }

  public void rotate(int[] nums, int k) {
    int temp, previous;
    //rotate from kth index
    for (int i = 0; i < k; i++) {
      previous = nums[nums.length - 1];
      for (int j = 0; j < nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }
  }
}

