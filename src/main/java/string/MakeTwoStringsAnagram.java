package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
 */
public class MakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) <= 0) {
                count++;
            }  if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i))- 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MakeTwoStringsAnagram().minSteps("gctcxyuluxjuxnsvmomavutrrfb",
                "qijrjrhqqjxjtprybrzpyfyqtzf"));
    }
}
