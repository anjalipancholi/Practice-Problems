package methodology;

import java.awt.Color;

public class Spotlight {

  public static final Color GREEN = Color.GREEN;
  public static final Color YELLOW = Color.YELLOW;
  public static final Color RED = Color.RED;
  private Color state;

  public Spotlight() {
    state = GREEN;
  }

  public static void main(String[] args) {
    new Spotlight().start();
  }

  public Color getState() {
    return state;
  }

  public void advance() {
    if (state == RED) {
      state = GREEN;
    } else if (state == YELLOW) {
      state = RED;
    } else if (state == GREEN) {
      state = YELLOW;
    }
  }

  private void start() {
  }

}
