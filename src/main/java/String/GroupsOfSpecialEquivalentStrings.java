package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsOfSpecialEquivalentStrings {

  public static void main(String[] args) {
    new GroupsOfSpecialEquivalentStrings()
        .numSpecialEquivGroups(new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"});
  }

  public int numSpecialEquivGroups(String[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    Set<String> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      int[] odd = new int[26];
      int[] even = new int[26];
      for (int j = 0; j < A[i].length(); j++) {
        char c = A[i].charAt(j);
        if (j % 2 == 0) {
          even[c - 'a']++;
        } else {
          odd[c - 'a']++;
        }
      }

      set.add(Arrays.toString(odd) + Arrays.toString(even));
    }
    System.out.println(set.size());
    return set.size();
  }
}
