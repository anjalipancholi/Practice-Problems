package array;

public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int temp = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > temp) {
                    count = temp;
                }
            }

        }
        System.out.println(temp);
        return temp;


    }

    public static void main(String[] args) {
        new MaximumConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
    }
}
