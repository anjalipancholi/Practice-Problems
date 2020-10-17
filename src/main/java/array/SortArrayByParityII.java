package array;

public class SortArrayByParityII {

  public static void main(String[] args) {
    new SortArrayByParityII().sortArrayByParityII(new int[]{4, 5, 2, 7});
  }

  public int[] sortArrayByParityII(int[] A) {

    int odd = 1;
    for (int even = 0; even < A.length; even += 2) {
      if (A[even] % 2 == 1) {
        while (A[odd] % 2 == 1) {
          odd += 2;
        }
        int temp = A[even];
        A[even] = A[odd];
        A[odd] = temp;
      }
    }

    return A;
  }
}
