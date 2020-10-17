package array;

public class AvailableCapturesForRook {


  public int numRookCaptures(char[][] board) {
    int result = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (board[i][j] == 'R') {
          // search up
          for (int k = i - 1; k >= 0; k--) {
            if (board[k][j] == 'p') {
              result++;
              break;
            } else if (board[k][j] == 'B') {
              break;
            }
          }
          // search down
          for (int k = i + 1; k < 8; k++) {
            if (board[k][j] == 'p') {
              result++;
              break;
            } else if (board[k][j] == 'B') {
              break;
            }
          }
          // search left
          for (int k = j - 1; k >= 0; k--) {
            if (board[i][k] == 'p') {
              result++;
              break;
            } else if (board[i][k] == 'B') {
              break;
            }
          }
          // search down
          for (int k = j + 1; k < 8; k++) {
            if (board[i][k] == 'p') {
              result++;
              break;
            } else if (board[i][k] == 'B') {
              break;
            }
          }
          break;
        }
      }
    }
    return result;
  }

}

