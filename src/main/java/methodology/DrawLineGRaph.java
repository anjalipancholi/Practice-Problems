package methodology;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawLineGRaph extends GraphicsProgram {

  public static void main(String[] args) {
    new DrawLineGRaph().start();
  }

  public void run() {
    GLine a = new GLine(0.0, 0.67, 0.4, 0.68);
    GLine b = new GLine(0.4, 0.68, 0.8, 0.71);
    GLine c = new GLine(0.8, 0.71, 1.2, 0.86);

  }

}
