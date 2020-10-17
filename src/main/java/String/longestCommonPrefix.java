package String;

public class longestCommonPrefix {

  public static void main(String[] args) {
    new longestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
  }

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    System.out.println(prefix);
    return prefix;
  }
}
