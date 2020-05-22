package methodology;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

  private static final int BRICK_NUMBER = 12;
  private static final int BRICK_WIDTH = 15;
  private static final int APPLICATION_WIDTH = 400;
  private static final int WIDTH = APPLICATION_WIDTH;
  private static final int APPLICATION_HEIGHT = 300;
  private static final int BRICK_HEIGHT = 8;
  private double rect;

  public void run() {
    int xOffset = 0;
    for (int i = 12; i >= 1; --i) {
      xOffset = 12 * BRICK_WIDTH;
      for (int j = 12; j >= i; --j) {

        double x = j * BRICK_WIDTH;
        double y = i * BRICK_HEIGHT;

        GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
        add(brick);


      }
    }
  }

  public static void main(String[] args) {
    new Pyramid().start();
  }
}
