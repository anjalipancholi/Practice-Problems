package array;


// This code is about the element that if it is present in the array it will return that position or ONE Forward .


public class PresentElement {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;


        while (i <= j) {
            int mid = (i + j) / 2;

            if (target > nums[mid]) {
                i = mid + 1;
            } else if (target < nums[mid]) {
                j = mid - 1;
            } else {
                return mid;
            }
        }

        return nums[i];

    }

    public static void main(String[] args) {
        new PresentElement().searchInsert(new int[]{1, 2, 3, 6}, 5);
    }
}

