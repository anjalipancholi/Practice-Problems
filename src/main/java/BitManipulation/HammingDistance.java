package BitManipulation;

public class HammingDistance {

  public int hammingDistance(int x, int y) {
    int count = 0;
    String str = Integer.toBinaryString(x ^ y);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}

