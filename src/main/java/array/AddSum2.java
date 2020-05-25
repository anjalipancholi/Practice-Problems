package array;

import java.io.OutputStream;
import java.util.Arrays;

public class AddSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int  i = 0;
        int j= numbers.length-1;


        while(j >i) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;

            } else {

                return new int[]{i + 1, j + 1};

            }


            }

        return null;
    }
    public static void main(String[] args) {
        new AddSum2().twoSum(new int[]{2, 1, 5, 4, 3}, 7);

    }
}
