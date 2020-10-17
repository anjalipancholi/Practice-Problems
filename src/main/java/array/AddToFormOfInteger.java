package array;

import java.util.ArrayList;
import java.util.List;


public class AddToFormOfInteger {

  public List<Integer> addToArrayForm(int[] A, int K) {

    List<Integer> result = new ArrayList<>();
    int index = A.length - 1;
    int carry = 0;
    int num = 0;
    while (K != 0 || index >= 0) {

      num = 0;
      if (index >= 0) {
        num += A[index];
      }
      if (K != 0) {
        num += K % 10;
      }
      num += carry;
      carry = num / 10;
      result.add(0, num % 10);
      index--;
      K = K / 10;
    }

    if (carry != 0) {
      result.add(0, carry);
    }
    return result;
  }


}


