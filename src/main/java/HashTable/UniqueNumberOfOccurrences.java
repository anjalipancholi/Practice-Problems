package HashTable;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i));
            } else {
                map.put(i, 1);
            }
        }
        Map<Integer, Integer> unique = new HashMap<>();
        for (int j : map.values()) {
            if (unique.containsKey(j)) {
                return false;
            } else {
                unique.put(j, 1);
            }
        }
        return true;
    }
}
