package array;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] ans = new int[heights.length];
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            ans[i] = heights[i];
        }
        Arrays.sort(ans);

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != heights[i]) {
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        new HeightChecker().heightChecker(new int[]{1, 1, 4, 2, 1, 3});
    }
}
