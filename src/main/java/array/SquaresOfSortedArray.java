package array;

public class SquaresOfSortedArray {

  public static void main(String[] args) {
    new SquaresOfSortedArray().sortedSquares(new int[]{-4, -1, 3, 5});
  }

  public int[] sortedSquares(int[] A) {
    int[] result = new int[A.length];
    int i = 0;
    int j = A.length - 1;
    int k = j;
    while (i < j) {
      int square1 = A[i] * A[i];
      int square2 = A[j] * A[j];
      if (square1 > square2) {
        result[k--] = square1;
        i++;
      } else {
        result[k--] = square2;
        j--;
      }
    }
    return result;
  }
}

