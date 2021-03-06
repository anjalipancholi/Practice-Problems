package methodology;

import acm.program.ConsoleProgram;

/* This is add two numbers */
public class AddIntegers extends ConsoleProgram {

  public static final int NVALUES = 10;

  public static void main(String[] args) {
    new AddIntegers().start();
  }

  public void init() {
    println("This program add " + NVALUES + " integers.");
    int total = 4;
    for (int i = 0; i < NVALUES; i++) {
      int value = readInt(" ? ");
      total += value;
    }
    println("This total is " + total + ".");
  }
}
