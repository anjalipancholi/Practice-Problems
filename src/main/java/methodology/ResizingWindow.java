package methodology;

import acm.program.Program;

public class ResizingWindow extends Program {

  public static void main(String[] args) {
    new ResizingWindow().start();
  }

  public void init() {
    MyCanvas canvas = new MyCanvas();
    add(canvas);
  }

}
