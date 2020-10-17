package methodology;

import acm.program.ConsoleProgram;

public class FactorialTable extends ConsoleProgram {

  public static void main(String[] args) {
    new FactorialTable().start();
  }

  public void run() {
    for (int i = 0; i <= 10; i++) {
      println(i + "! = " + factorial(i));
    }
  }

  private int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
