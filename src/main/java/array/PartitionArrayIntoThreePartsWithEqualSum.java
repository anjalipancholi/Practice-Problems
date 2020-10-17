package array;

public class PartitionArrayIntoThreePartsWithEqualSum {

  public static void main(String[] args) {
    new PartitionArrayIntoThreePartsWithEqualSum()
        .canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1});
  }

  public boolean canThreePartsEqualSum(int[] A) {
    int sum = 0;
    for (int i : A) {
      sum += i;
    }
    if (sum % 3 != 0) {
      return false;
    }

    sum = sum / 3;

    int count = 0;
    int temp = 0;
    for (int i = 0; i < A.length; ++i) {
      temp += A[i];
      if (temp == sum) {
        count++;
        temp = 0;
      }
    }

    return count == 3;

  }
}
