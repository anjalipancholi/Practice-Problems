package array;

import java.util.Scanner;

public class Arrays1D {

  private static int[] arrays1D(int n) {
    int[] ans = new int[n];
    int i = 0;
    int j = 0;
    while (j < ans.length) {
      if (i % 2 == 0) {
        ans[j++] = i;
      }
      i++;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ans = arrays1D(n);

    for (int x : ans) {
      System.out.print(x + " ");
    }
  }
}
