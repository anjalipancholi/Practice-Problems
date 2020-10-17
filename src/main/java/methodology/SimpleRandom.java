package methodology;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class SimpleRandom extends ConsoleProgram {

  private final RandomGenerator rgen = RandomGenerator.getInstance();

  public static void main(String[] args) {
    new SimpleRandom().start();
  }

  @Override
  public void run() {
    rgen.setSeed(7);
    int dieRoll = rgen.nextInt(1, 6);
    println("rolled" + dieRoll);
  }
}
