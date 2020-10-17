package array;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {

  public static void main(String[] args) {
    new BinaryPrefixDivisibleBy5().prefixesDivBy5(new int[]{0, 1, 1});
  }

  public List<Boolean> prefixesDivBy5(int[] A) {
    if (A == null || A.length <= 0) {
      return null;
    }
    int i = 0;
    int j = i + 1;
    List<Boolean> list = new ArrayList<>();
    while (j < A.length) {
      if ((A[i] += A[j] % 5) == 0) {
        list.add(true);
        j++;
      } else {
        list.add(false);
      }
    }
    return list;

  }
}
