package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        for (String i : words) {
            String result = "";
            for (int j = 0; j < i.length(); j++) {
                result += codes[i.charAt(j) - 'a'];
            }
            set.add(result);
        }
        return set.size();
    }
}
