package string;

public class CompareStringsByFrequencyOfItsSmallestCharacter {

  public int[] numSmallerByFrequency(String[] queries, String[] words) {
    int[] freqQueries = new int[queries.length];
    int[] freqWords = new int[words.length];
    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int[] frequency = new int[26];
      int count = 0;
      for (char c : queries[i].toCharArray()) {
        frequency[c - 'a']++;
      }
      for (int j : frequency) {
        if (j > 0) {
          count = j;
          break;
        }
      }
      freqQueries[i] = count;
    }

    for (int i = 0; i < words.length; i++) {
      int[] frequency = new int[26];
      int count = 0;
      for (char c : words[i].toCharArray()) {
        frequency[c - 'a']++;
      }
      for (int j : frequency) {
        if (j > 0) {
          count = j;
          break;
        }
      }
      freqWords[i] = count;
    }

    for (int i = 0; i < freqQueries.length; i++) {
      for (int j = 0; j < freqWords.length; j++) {
        if (freqQueries[i] < freqWords[j]) {
          result[i]++;
        }
      }
    }
    return result;
  }
}
