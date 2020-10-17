package String;

public class ImplementstrStr {

  public int strStr(String haystack, String needle) {
    int i = 0;
    int j = 0;
    if (needle.length() == 0) {
      return 0;
    }
    while (i < haystack.length()) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        i++;
        j++;
      } else {
        i = i - j + 1;
        j = 0;
      }
      if (j == needle.length()) {
        return i - j;
      }
    }
    return -1;
  }

}
