package array;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }

        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else {
                int temp = nums[i];
                nums[i] = nums[i - zeroes];
                nums[i - zeroes] = temp;


            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

