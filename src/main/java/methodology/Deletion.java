package methodology;

import acm.program.ConsoleProgram;


public class Deletion extends ConsoleProgram {

  public static void main(String[] args) {
    new Deletion().start();
  }

  public void run() {
    println("");


  }

  private String removeAllOccurences(String str, char ch) {
    String result = "";
    for (int i = 0; i <= str.length(); i++) {
      if (str.charAt(i) != ch) {
        return str.charAt(i) + result;
      }
    }
    return result;
  }

}
