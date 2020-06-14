package array;


import java.util.Arrays;

public class DuplicateZeroes {
    public int[] duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        new DuplicateZeroes().duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}
