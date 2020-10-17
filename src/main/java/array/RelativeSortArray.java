package array;

import java.util.*;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] res = new int[arr1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1)
            map.put(i, map.getOrDefault(i, 0) + 1);

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr2)
            set.add(i);

        int k = 0;
        for (int i : arr2) {
            int freq = map.get(i);
            if (freq > 0) {
                for (int j = 0; j < freq; j++)
                    res[k++] = i;
            }
        }
        Arrays.sort(arr1);

        for (int i : arr1) {
            if (!set.contains(i))
                res[k++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        new RelativeSortArray().relativeSortArray(new int[]{1, 4, 3, 5, 6, 2, 8, 3}, new int[]{2, 1, 8, 3});
    }
}