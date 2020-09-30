package BitManipulation;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {

            int temp = getSetBit(i);
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7 || temp == 11 || temp == 13 || temp == 17 || temp == 19) {
                count++;
            }
        }
        return count;
    }

    public int getSetBit(int in) {
        int answer = 0;
        while (in > 0) {
            if (in % 2 != 0) answer++;
            in = in / 2;
        }
        return answer;
    }
}
