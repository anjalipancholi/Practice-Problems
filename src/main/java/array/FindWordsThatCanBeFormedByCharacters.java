package array;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (map.containsKey(c)) {
                    count += words[i].length();
                }
            }
        }
        return count;
    }
public static void main(String[] args) {
        new FindWordsThatCanBeFormedByCharacters().countCharacters(new String[]{},new String());
}
}
