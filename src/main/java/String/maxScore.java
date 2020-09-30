package String;

public class maxScore {
    public int maxScore(String s) {
        int maxCount =0;
        for (int i = 1; i < s.length(); i++) {
            int count = 0;
            for (char c : s.substring(0, i).toCharArray()) {
                if (c == '0') {
                    count++;
                }
            }
            for (char c : s.substring(i, s.length()).toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
