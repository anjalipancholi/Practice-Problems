package methodology;

import acm.program.ConsoleProgram;

public class AddingCommas extends ConsoleProgram {

  public void run() {
    while (true) {
      String digits = readLine("Enter String:");
      if (digits.length() == 0) {
        break;
      }
      println(addingCommas(digits));
    }
  }

  private String addingCommas(String digits) {
    String result = "";
    int len = digits.length();
    int nDigits = 0;
    for (int i = len - 1; i >= 0; i--) {
      result = digits.charAt(i) + result;
      nDigits++;
      if (((nDigits % 3) == 0) && (i > 0)) {
        result = "," + result;
      }
    }
    return result;

  }

  public static void main(String[] args) {
    new AddingCommas().start();
  }
}
