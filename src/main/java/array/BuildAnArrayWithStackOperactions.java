package array;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperactions {

  public List<String> buildArray(int[] target, int n) {
    int count = 1;
    List<String> list = new ArrayList<>();
    for (int i = 1; i < target.length; i++) {
      while (target[i] > count++) {
        list.add("Push");
        list.add("Pop");
      }
      list.add("Push");
    }
    return list;
  }
}


