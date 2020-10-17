package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FillingJugs {

    private static int fillingJugs(int[] C, int N) {
        int j = 0;

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            if (C[i] < C[i + 1]) {
                C[i + 1] = C[i];
            }
        }
        for (int i = 0; i < N; i++) {
            sum += C[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(reader.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.valueOf(reader.readLine());
            int[] capacity = new int[N];
            String[] sCapacity = reader.readLine().split(" ");
            for (int i = 0; i < sCapacity.length; i++) {
                capacity[i] = Integer.valueOf(sCapacity[i]);
            }
            System.out.println(fillingJugs(capacity, N));
        }
    }
}



