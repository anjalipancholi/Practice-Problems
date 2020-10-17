package array;

public class SortArrayByParity {

  public static void main(String[] args) {
    new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4});
  }

  public int[] sortArrayByParity(int[] A) {
    int i = -1;
    for (int j = 0; j < A.length; j++) {
      if (A[j] % 2 == 0) {
        i += 1;
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
      }
    }
    return A;
  }
}
