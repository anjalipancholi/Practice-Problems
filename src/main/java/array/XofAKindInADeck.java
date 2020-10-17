package array;

import java.util.HashSet;
import java.util.Set;

public class XofAKindInADeck {

  public static void main(String[] args) {
    new XofAKindInADeck().hasGroupsSizeX(new int[]{1, 1, 2, 2, 3, 3});
  }

  public boolean hasGroupsSizeX(int[] deck) {
    int count = 0;
    Set<Integer> set = new HashSet<>();
    for (int i : deck) {
      if (set.contains(i)) {
        count++;
        if (count % 2 == 0) {
          i++;
        } else {
          return false;
        }

      } else {
        set.add(i);
      }

    }
    return true;
  }
}
