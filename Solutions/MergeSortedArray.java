package Solutions;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

//
        if (n == 0) return;
        int i = m - 1, j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
                if (j == -1) break;
            }
        }
    }
}



