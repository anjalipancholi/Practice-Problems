package array;

public class SumOfEvenNumbersAfterQueries {

  public static void main(String[] args) {
    new SumOfEvenNumbersAfterQueries()
        .sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{2, 1}, {1, 3}});
  }

  public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int S = 0;
    for (int x : A) {
      if (x % 2 == 0) {
        S += x;
      }
    }

    int[] ans = new int[queries.length];

    for (int i = 0; i < queries.length; ++i) {
      int val = queries[i][0], index = queries[i][1];
      if (A[index] % 2 == 0) {
        S -= A[index];
      }
      A[index] += val;
      if (A[index] % 2 == 0) {
        S += A[index];
      }
      ans[i] = S;
    }

    return ans;
  }
}
