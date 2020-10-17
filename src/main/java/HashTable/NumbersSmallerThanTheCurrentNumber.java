package HashTable;

public class NumbersSmallerThanTheCurrentNumber {

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int count = 0;
    int[] numbers = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (j != i && nums[j] < nums[i]) {
          count++;
        }
      }
      numbers[i] = count;
      count = 0;
    }
    return numbers;
  }
}
