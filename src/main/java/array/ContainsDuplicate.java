package array;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    // to  check if there is more than one same integer
    public boolean containsDuplicate(int[] nums) {

        //after sorting same integers will come together
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;


        }
        System.out.println();
        return false;
    }

    public static void main(String[] args) {
        new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1});
    }
}
