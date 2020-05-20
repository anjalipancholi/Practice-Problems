import acm.program.ConsoleProgram;

public class Length extends ConsoleProgram {
    @Override
    public void run() {
        String line = readLine("");
        println("That string has " + line.length() + "characters.");
    }
    public static void main(String[] args) {
        new Length().start();
    }
}
