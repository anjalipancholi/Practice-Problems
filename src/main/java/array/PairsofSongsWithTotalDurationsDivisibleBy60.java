package array;

public class PairsofSongsWithTotalDurationsDivisibleBy60 {

  public static void main(String[] args) {
    new PairsofSongsWithTotalDurationsDivisibleBy60()
        .numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
  }

  public int numPairsDivisibleBy60(int[] time) {
    int[] cnt = new int[60];
    int total = 0;
    for (int i : time) {
      int remainder = i % 60;
      int comp = (60 - remainder) % 60;
      total += cnt[comp];
      cnt[remainder]++;
    }

    return total;
  }
}
