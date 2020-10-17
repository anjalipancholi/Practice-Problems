package methodology.yahtzee;

public interface YahtzeeConstants {

  /**
   * The width of the application window
   */
  int APPLICATION_WIDTH = 600;
  /**
   * The height of the application window
   */
  int APPLICATION_HEIGHT = 350;
  /**
   * The number of dice in the game
   */
  int N_DICE = 5;
  /**
   * The maximum number of players
   */
  int MAX_PLAYERS = 4;
  /**
   * The total number of categories
   */
  int N_CATEGORIES = 17;
  /**
   * The number of categories in which the player can score
   */
  int N_SCORING_CATEGORIES = 13;
  /* The constants that specify categories on the scoresheet */
  int ONES = 1;
  int TWOS = 2;
  int THREES = 3;
  int FOURS = 4;
  int FIVES = 5;
  int SIXES = 6;
  int UPPER_SCORE = 7;
  int UPPER_BONUS = 8;
  int THREE_OF_A_KIND = 9;
  int FOUR_OF_A_KIND = 10;
  int FULL_HOUSE = 11;
  int SMALL_STRAIGHT = 12;
  int LARGE_STRAIGHT = 13;
  int YAHTZEE = 14;
  int CHANCE = 15;
  int LOWER_SCORE = 16;
  int TOTAL = 17;
}

