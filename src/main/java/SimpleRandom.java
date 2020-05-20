import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import javax.swing.*;

public class SimpleRandom extends ConsoleProgram {
    @Override
    public void run() {
        rgen.setSeed(7);
        int dieRoll = rgen.nextInt(1, 6);
      println("rolled" + dieRoll);
    }
    private RandomGenerator rgen = RandomGenerator.getInstance();
    public static void main(String[] args) {
        new SimpleRandom().start();
    }
}
