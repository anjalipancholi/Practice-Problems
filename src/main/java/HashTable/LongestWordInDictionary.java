package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String result = "";
        Set<String> set = new HashSet<>();
        for(int i =0; i < words.length; i++) {
            if(words[i].length() == 1 || set.contains(words[i].substring(0,words[i].length()))){
                if(words[i].length()> result.length()) {
                    result = words[i];
                    set.add(words[i]);
                }
            }
        }
        return result;
    }
}
