package methodology;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class HelloProgram extends GraphicsProgram {

  public static void main(String[] args) {
    new HelloProgram().start();
  }

  public void run() {
    GLabel label = new GLabel("hello, world", 100, 75);
    label.setFont("SansSerif-36");
    label.setColor(Color.RED);
    add(label);
  }
}