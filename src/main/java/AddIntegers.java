import acm.program.ConsoleProgram;

public class AddIntegers extends ConsoleProgram {
   public static final int NVALUES = 10;

    @Override
    public void init() {
        println("This program add " + NVALUES + " integers.");
        int total = 4;
        for (int i = 0; i < NVALUES; i++);
        {
            int value = readInt(" ? ");
            total += value;
        }
        println("This total is " + total + ".");
    }
    public static void main(String[] args) {
        new AddIntegers().start();
    }
}
