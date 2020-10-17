package HashTable;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;
    int y = 0;
    int[] intersection = new int[Math.min(nums1.length, nums2.length)];

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        intersection[y] = nums1[i];
        while (i < nums1.length && nums1[i] == intersection[y]) {
          i++;
        }
        while (j < nums2.length && nums2[j] == intersection[y]) {
          j++;
        }
        y++;
      }
    }
    return Arrays.copyOf(intersection, y);
  }
}
