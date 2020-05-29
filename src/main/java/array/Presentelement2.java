package array;


// This code is about the element that if it is present in the array it will return that position or ONE Forward .


public class Presentelement2 {
    public int insert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j - 1) {
            int mid = (i + j) / 2;

            if (target > nums[mid]) {
                i = mid + 1;
            } else if (target < nums[mid]) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        System.out.println(i);
        return i;

    }

    public static void main(String[] args) {
        new Presentelement2().insert(new int[]{1, 3, 5, 6}, 2);
    }
}

