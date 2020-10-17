package HashTable;

import java.util.Arrays;

public class FindTheDifference {

  public char findTheDifference(String s, String t) {
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    int i = 0;
    int j = 0;
    Arrays.sort(a);
    Arrays.sort(b);
    while (i < a.length && j < b.length) {
      if (a[i] != b[j]) {
        return b[i];
      }
      i++;
      j++;
    }
    return b[b.length - 1];
  }
}

