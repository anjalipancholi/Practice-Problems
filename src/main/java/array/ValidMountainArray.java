package array;

public class ValidMountainArray {

  public static void main(String[] args) {
    new ValidMountainArray().validMountainArray(new int[]{3, 5, 4});
  }

  public boolean validMountainArray(int[] A) {

    if (A.length < 3) {
      return false;
    }

    int i = 0;

    while (i < A.length - 1 && A[i] < A[i + 1]) {
      i++;

      if (i == 0 || i == A.length - 1) {
        return false;
      }
      i++;
    }

    while (i > 0 && i < A.length && A[i] < A[i - 1]) {
      i++;
    }

    return i == A.length;
  }
}

