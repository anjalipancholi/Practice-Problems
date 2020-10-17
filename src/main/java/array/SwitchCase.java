package array;

import java.util.Scanner;

public class SwitchCase {

  private static String switchCase(int m, int[] arr) {
    int i = 0;
    while (i < arr.length) {
      switch (arr[i]) {
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
      }
      i++;
    }
    return "";
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int[] arr = new int[m];

    for (int i = 0; i < m; i++) {
      arr[i] = sc.nextInt();
    }

    String res = switchCase(m, arr);

    System.out.println(res);
  }
}
