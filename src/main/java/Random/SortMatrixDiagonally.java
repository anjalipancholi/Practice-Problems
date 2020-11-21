package Random;

import java.util.Arrays;

public class SortMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int r = i + 1, c = j + 1; r < row && c < col; r++, c++) {
                    if (mat[i][j] > mat[r][c]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[r][c];
                        mat[r][c] = temp;
                    }
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new SortMatrixDiagonally().
                diagonalSort(new int[][]{{3, 3, 1, 1, 1}, {2, 2, 1, 2}})));
    }
}
