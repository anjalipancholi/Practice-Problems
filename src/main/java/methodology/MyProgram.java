package methodology;

import acm.program.ConsoleProgram;

public class MyProgram extends ConsoleProgram {

  @Override
  public void run() {
    double b = readDouble("Enter b: ");
    double h = readDouble("Enter h: ");
    double a = (b * h) / 2;
    println("a = " + a);
  }

  public static void main(String[] args) {
    new MyProgram().start();
  }
}
