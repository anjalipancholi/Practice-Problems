package array;

import java.util.Scanner;

public class ForLoop {

  public static void forLoop(int f) {
    int t1 = 0;
    int t2 = 1;
    for (int i = 1; i <= f; i++) {
      String result = t1 + " ";
      System.out.println(result);
      int sum = t1 + t2;
      t1 = t2;
      t2 = sum;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int f = sc.nextInt();
    forLoop(f);
  }
}
