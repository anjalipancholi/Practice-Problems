package HashTable;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i]))
                map.put(A[i], 1);
            else
                return A[i];
        }
        return -1;
    }
}