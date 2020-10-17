package string;

import java.util.HashSet;
import java.util.Set;

/**
 * 1433. Check If a String Can Break Another String
 */
public class BreakString {

  private static boolean checkIfCanBreak(String s1, String s2) {
    return checkBreaksFrequency(getFrequency(s1), getFrequency(s2)) || checkBreaksFrequency(
        getFrequency(s2), getFrequency(s1));
  }

  private static boolean checkBreaksFrequency(int[] f1, int[] f2) {
    int i = 0, j = 0;
    while (i < f1.length && j < f2.length) {
      while (i < f1.length && f1[i] == 0) i++;
      while (j < f2.length && f2[j] == 0) j++;
      if (j > i) return false;
      if (i < f1.length) f1[i]--;
      if (j < f2.length) f2[j]--;
    }
    return true;
  }

  private static int[] getFrequency(String s) {
    int[] frequency = new int[26];
    for (int i = 0; i < s.length(); i++) {
      frequency[s.charAt(i) - 'a']++;
    }
    return frequency;
  }

  /**
   * Checks if exact {@param s1} breaks {@param s2} in the exact order of characters.
   */
  private static boolean checkBreaks(String s1, String s2) {
    assert (s1.length() == s2.length());
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) < s2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Generates all the permutations for the given string {@param s}.
   */
  private static Set<String> generatePermutations(String s) {
    Set<String> permutations = new HashSet<>();
    generatePermutationHelper(s.toCharArray(), 0, permutations);
    System.out.println(permutations);
    return permutations;
  }

  private static void generatePermutationHelper(char[] s, int index, Set<String> permutations) {
    permutations.add(new String(s));
    for (int i = index; i < s.length; i++) {
      swap(s, index, i);
      generatePermutationHelper(s, index + 1, permutations);
      swap(s, index, i);
    }
  }

  private static void swap(char[] s, int i, int j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }

  public static void main(String[] args) {
    System.out.println(checkIfCanBreak("leetcodee", "interview"));
  }
}
