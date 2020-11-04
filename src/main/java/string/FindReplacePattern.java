package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 890. Find and Replace Pattern
 */

public class FindReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        Map<Character, Character> mapWord = new HashMap<>();
        Map<Character, Character> mapPattern = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!mapWord.containsKey(word.charAt(i))) {
                    mapWord.put(word.charAt(i), pattern.charAt(i));
                }
                if (!mapPattern.containsKey(pattern.charAt(i))) {
                    mapPattern.put(pattern.charAt(i), word.charAt(i));
                }
                if (mapWord.get(word.charAt(i)) != pattern.charAt(i) ||
                        mapPattern.get(pattern.charAt(i)) != word.charAt(i)) {
                    break;
                }
                if (i == pattern.length() - 1) {
                    result.add(word);
                }
            }
            mapWord.clear();
            mapPattern.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FindReplacePattern().findAndReplacePattern(
                new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }
}

