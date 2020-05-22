package methodology.yahtzee;

import acm.graphics.GCanvas;


public class YahtzeeDisplay extends Yahtzee implements YahtzeeConstants {

  public YahtzeeDisplay(GCanvas gc, String[] playerNames) {
    GCanvas canvas = new GCanvas();
    add(gc);
    for (int i = 0; i <= MAX_PLAYERS; i++) {
      int value = readInt(" Enter the number of players: ");
    }
  }


}
