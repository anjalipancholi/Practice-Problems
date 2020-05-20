import acm.program.GraphicsProgram;

public class CheckerBoard extends GraphicsProgram {
    public void run() {
        for (int i=0; i < Number_Rows; i++) {
            for (int j=0; j < Number_Columns; i++) {

                double x = j * Number_Rows;
                double y = i * Number_Columns;

            }
        }
    }

    private void add(int i) {
    }

    private  int Number_Rows = getHeight() / 8;
    private int Number_Columns = getWidth() / 8;

    public static void main(String[] args) {
        new CheckerBoard().start();
    }
}
