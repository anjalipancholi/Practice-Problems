import acm.program.*;
public class Assignment_4 extends ConsoleProgram {
    public void run() {
        ghost(13);
    }
    private void ghost(int x) {
        int y = 0;
        for (int i = 1; i < x; i *= 2) {
            y = witch(y, skeleton(x, i));
        }
        println("ghost: x = " + x + ", y = " + y);
    }
    private int witch(int x, int y) {
        x = 10 * x + y;
        println("witch: x = " + x + ", y = " + y);
        return x;
    }
    private int skeleton(int x, int y) {
        return x / y % 2;
    }
    public static void main(String[] args) {
        new Assignment_4().start();
    }
}
