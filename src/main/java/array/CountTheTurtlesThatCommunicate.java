package array;

import java.io.*;
import java.util.*;

public class CountTheTurtlesThatCommunicate {
    public int countTurtles(int[][] grid) {
        int[] rowSum = new int[grid.length];
        int[] columnSum = new int[grid[0].length];
        int k = 0;
        int l = 0;
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            int countSum = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    countSum++;
                }
            }
                rowSum[k] = countSum;
                k++;

        }
        for (int i = 0; i < n; i++) {
            int countSum = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) {
                    countSum++;
                }
            }
                columnSum[l] = countSum;
                l++;

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (columnSum[j] + rowSum[i] > 2) {
                        result++;
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int result = new CountTheTurtlesThatCommunicate().countTurtles(grid);
        System.out.println(result);
    }
}
