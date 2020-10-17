package methodology;

import acm.program.ConsoleProgram;

public class Length extends ConsoleProgram {

  public static void main(String[] args) {
    new Length().start();
  }

  @Override
  public void run() {
    String line = readLine("");
    println("That string has " + line.length() + "characters.");
  }
}
