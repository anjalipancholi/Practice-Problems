package string;

import java.util.HashSet;
import java.util.Set;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 */
public class MaximumNumberOfVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int start = 0;
        int count = 0;
        int result = 0;
        for (int end = 0; end < s.length(); end++) {
            if (end - start > k) {
                if (vowels.contains(s.charAt(start))) {
                    count--;
                }
                start++;
            }
            if (vowels.contains(s.charAt(end))) {
                count++;
            }
            result = Math.max(result, count);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumNumberOfVowels().maxVowels("abciiidef", 3));
    }
}
