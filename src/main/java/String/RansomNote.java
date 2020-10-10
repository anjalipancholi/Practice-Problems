package String;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!hashmap.containsKey(magazine.charAt(i)))
                hashmap.put(magazine.charAt(i), 1);
            else
                hashmap.put(magazine.charAt(i), hashmap.get(magazine.charAt(i)) + 1);
        }
        int start = 0;
        while (start < ransomNote.length()) {
            if (!hashmap.containsKey(ransomNote.charAt(start)))
                return false;
            else {
                hashmap.put(ransomNote.charAt(start), hashmap.get(ransomNote.charAt(start)) - 1);
                if (hashmap.get(ransomNote.charAt(start)) == 0)
                    hashmap.remove(ransomNote.charAt(start));
            }
            start++;
        }
        return true;
    }
}
