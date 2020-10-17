package array;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    String lowercases = s.toLowerCase();
    int start = 0;
    int end = s.length() - 1;
    while (end > start) {
      if (!Character.isLetterOrDigit(lowercases.charAt(start))) {
        start++;
      } else if (!Character.isLetterOrDigit(lowercases.charAt(end))) {
        end--;
      } else if (lowercases.charAt(start) != lowercases.charAt(end)) {
        return false;
      } else {
        start++;
        end--;
      }
    }
    return true;
  }
}
