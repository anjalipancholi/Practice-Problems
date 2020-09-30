package HashTable;

public class kthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != count) {
                k--;
                if (k == 0) {
                    return count;
                }
                count++;
            }
            count++;
        }
        return count - 1 + k;
    }
}
