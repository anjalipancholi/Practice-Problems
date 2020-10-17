package string;

public class ThousandSeparator {

  public String thousandSeparator(int n) {
    String integer = String.valueOf(n);
    for (int i = integer.length() - 3; i >= 0; i = i - 3) {
      String string = integer.substring(0, i);
      if (string.length() > 0) {
        integer = string + "." + integer.substring(i);
      }
    }
    return integer;
  }
}