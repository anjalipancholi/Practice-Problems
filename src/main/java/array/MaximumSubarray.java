package array;

public class MaximumSubarray {

  private String getSubArrayString(int[] A, int start, int end) {
    String s = "[";
    for (int i = start; i <= end; i++) {
      s += (A[i] + " ");
    }
    s = s.trim() + "]";
    return s;
  }

  private void printSubArrays(int[] A) {
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A.length; j++) {
        System.out.println("(" + i + "," + j + "): " + getSubArrayString(A, i, j));
      }
    }
  }

  public static void main(String[] args) {
    new MaximumSubarray().printSubArrays(new int[]{1, 2, 3, 4, 5});
  }
}
