package String;

public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s) {
        int leftDistinct = 0;
        int rightDistinct = 0;
        int result = 0;
        int[] left = new int[26];
        int[] right = new int[26];
        for (char ch : s.toCharArray()) {
            right[ch - 'a']++;
            if (right[ch - 'a'] == 1) {
                rightDistinct++;
            }
        }
        for (char ch : s.toCharArray()) {
            left[ch - 'a']++;
            if (left[ch - 'a'] == 1) {
                leftDistinct++;
            }
            right[ch - 'a']--;
            if (right[ch - 'a'] == 0) {
                rightDistinct--;
            }
            if (rightDistinct == leftDistinct) {
                result += 1;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new NumberOfGoodWaysToSplitAString().numSplits("acbadbaada");
    }
}
