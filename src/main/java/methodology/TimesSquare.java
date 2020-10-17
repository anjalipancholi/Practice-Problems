package methodology;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class TimesSquare extends GraphicsProgram {

  private static final double PAUSE_TIME = 20;
  private static final double delta_x = 2.0;
  private static final String Headline = " TimeSquare";

  @Override
  public void run() {
    GLabel label = new GLabel(Headline);
    label.setFont("Times-72");
    add(label, getWidth(), (getHeight() + label.getAscent()) / 2);
    while (label.getX() + label.getWidth() > 0) {
      label.move(-delta_x, 0);
      pause(PAUSE_TIME);
    }
  }

  public static void main(String[] args) {
    new TimesSquare().start();
  }
}
