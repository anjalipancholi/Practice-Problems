package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 1023. Camelcase Matching
 */
public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for (String query : queries) {
            result.add(isMatch(query, pattern));
        }
        return result;
    }

    private boolean isMatch(String query, String pattern) {
        int i = 0;
        for (Character c : query.toCharArray()) {
            if (i < pattern.length() && c == pattern.charAt(i)) {
                i++;
            } else if (c < 'a') {
                return false;
            }
        }
        return i == pattern.length();
    }

    public static void main(String[] args) {
        System.out.println(new CamelcaseMatching().camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FB"));
    }
}
