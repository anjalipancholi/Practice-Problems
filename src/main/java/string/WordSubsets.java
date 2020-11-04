package string;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();
        int[] freqB = new int[26];
        for (String b : B) {
            int[] temp = new int[26];
            for (char c : b.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                freqB[i] = Math.max(freqB[i], temp[i]);
            }
        }
        for (String a : A) {
            int[] freqA = new int[26];
            for (int i = 0; i < a.length(); i++) {
                freqA[a.charAt(i) - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (freqB[j] > freqA[j]) {
                    break;
                }
                if (j >= 25) {
                    result.add(a);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new WordSubsets().wordSubsets(new String[]
                        {"amazon", "apple", "facebook", "google", "leetcode"},
                new String[]{"lo", "eo"}));
    }

    public List<String> wordSubset(String[] A, String[] B) {
        List<String> result = new ArrayList<>();

        for (String a : A) {
            int[] freqA = new int[26];
            for (int i = 0; i < a.length(); i++) {
                freqA[a.charAt(i) - 'a']++;
            }
            int count = 0;
            for (String b : B) {
                int[] freqB = new int[26];
                for (char c : b.toCharArray()) {
                    freqB[c - 'a']++;
                }
                for (int j = 0; j < 26; j++) {
                    if (freqB[j] > freqA[j]) {
                        break;
                    }
                    if (j >= 25) {
                        count++;
                    }
                }
            }
            if (count == B.length) {
                result.add(a);
            }
        }
        return result;

    }
}
