package HashTable;

import java.util.Map;

public class VeryfyinganAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        int i = 1;
        boolean flag = false;

        for (char c : order.toCharArray())
            rank[c - 'a'] = i++;

        for (i = 0; i < words.length - 1; i++) {
            if (rank[words[i].charAt(0) - 'a'] > rank[words[i + 1].charAt(0) - 'a'])
                return false;
            else if (rank[words[i].charAt(0) - 'a'] == rank[words[i + 1].charAt(0) - 'a']) {

                for (int j = 0; j < words[i].length() && j < words[i + 1].length(); j++) {
                    if (rank[words[i].charAt(j) - 'a'] > rank[words[i + 1].charAt(j) - 'a'])
                        return false;
                    else if (rank[words[i].charAt(j) - 'a'] < rank[words[i + 1].charAt(j) - 'a']) flag = true;
                }

                if (flag == false && words[i].length() > words[i + 1].length()) return false;
            }
        }
        return true;
    }
}