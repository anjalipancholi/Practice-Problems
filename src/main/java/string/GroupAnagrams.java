package string;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for (String i : strs) {
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(i);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
