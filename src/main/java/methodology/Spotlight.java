package methodology;

import java.awt.Color;

public class Spotlight {

  public static final Color GREEN = Color.GREEN;
  public static final Color YELLOW = Color.YELLOW;
  public static final Color RED = Color.RED;

  public Spotlight() {
    state = GREEN;
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

  private Color state;

  public static void main(String[] args) {
    new Spotlight().start();
  }

  private void start() {
  }

}
