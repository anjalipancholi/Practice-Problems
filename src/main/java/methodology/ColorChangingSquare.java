package methodology;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class ColorChangingSquare extends GraphicsProgram {

  private static final double Pause_time = 1000;
  private static final double s_size = 100;
  private final RandomGenerator rgen = new RandomGenerator();

  public static void main(String[] args) {
    new ColorChangingSquare().start();
  }

  public void run() {
    GRect square = new GRect(s_size, s_size);
    square.setFilled(true);
    add(square, (getWidth() - s_size) / 2, (getHeight() - s_size) / 2);
    while (true) {
      square.setColor(rgen.nextColor());
      pause(Pause_time);
    }
  }
}
