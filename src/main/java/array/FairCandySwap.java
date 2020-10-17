package array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

  public static void main(String[] args) {
    new FairCandySwap().fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});
  }

  public int[] fairCandySwap(int[] A, int[] B) {
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < A.length; i++) {
      sum1 += A[i];
    }
    for (int j = 0; j < B.length; j++) {
      sum2 += B[j];
    }
    int result = (sum2 - sum1) / 2;
    Set<Integer> set = new HashSet();
    for (int x : B) {
      set.add(x);
    }

    for (int y : A) {
      if (set.contains(result + y)) {
        return new int[]{y, y + result};
      }
    }

    return null;
  }
}

