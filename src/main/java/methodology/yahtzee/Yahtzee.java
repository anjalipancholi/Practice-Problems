package methodology.yahtzee;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Yahtzee extends GraphicsProgram implements YahtzeeConstants {

  public void run() {
    nPlayers = readInt("Enter the number of players:");
    playerNames = new String[nPlayers];
    for (int i = 1; i <= nPlayers; i++) {
      playerNames[i - 1] = readLine(" Enter the name of player" + i);
    }
    display = new YahtzeeDisplay(getGCanvas(), playerNames);
    playGame();
  }

  private void playGame() {
    scoreCard = new int[N_CATEGORIES][nPlayers];
    for (int turns = 0; turns <= N_SCORING_CATEGORIES; turns++) {
      for (int player = 1; player <= nPlayers; player++) {
        startFirstDiceRoll();
        secondAndThirdRoll();
      }
//        selectCategory(player);
    }


  }

  private void startFirstDiceRoll() {
  }

  private void secondAndThirdRoll() {

  }

  private void startFirstDiceRoll(int player) {
    //  display.waitForPlayerToClickRoll(player);
    for (int dice = 0; dice <= N_DICE; dice++) {

    }


  }

  private int[][] scoreCard;
  private int[] diceRoll = new int[N_DICE];
  private String[] playerNames;
  private int nPlayers;
  private RandomGenerator rgen = new RandomGenerator();
  private YahtzeeDisplay display;

  public static void main(String[] args) {
    new Yahtzee().start();
  }
}







