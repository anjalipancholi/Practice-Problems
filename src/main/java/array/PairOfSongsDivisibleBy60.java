package array;

/**
 * 1010. Pairs of Songs With Total Durations Divisible by 60
 */
public class PairOfSongsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int sum = time[i] + time[j];
                if(sum % 60 == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new PairOfSongsDivisibleBy60().
                numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40}));
    }
}
