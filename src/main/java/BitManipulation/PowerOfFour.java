package BitManipulation;

public class PowerOfFour {

  public boolean isPowerOfFour(int num) {
    if ((num <= 0)) {
      return false;
    }
    if (num == 1) {
      return true;
    }
    while (num > 3) {
      if (num % 4 != 0) {
        return false;
      }
      num /= 4;
    }
    return true;
  }
}
