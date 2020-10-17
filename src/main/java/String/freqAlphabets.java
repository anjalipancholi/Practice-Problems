package String;


public class freqAlphabets {

  public static void main(String[] args) {
    new freqAlphabets().freqAlphabets("10#11#12");
  }

  public String freqAlphabets(String s) {
    StringBuilder sb = new StringBuilder();
    int i = s.length() - 1;
    while (i >= 0) {
      int v = 0;
      if (s.charAt(i) == '#') {
        if (i - 2 >= 0) {
          v = Integer.parseInt(s.substring(i - 2, i));
          i = i - 3;
        }
      } else {
        v = s.charAt(i) - '0';
        i = i - 1;
      }
      sb.append((char) (v + 'a' - 1));
    }
    return sb.reverse().toString();
  }
}
