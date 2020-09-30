package Graphs;

public class findJudge {
    public int findJudge(int N, int[][] trust) {
        int[] inOut = new int[N + 1];
        for (int[] i : trust) {
            inOut[i[0]]--;
            inOut[i[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (inOut[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
