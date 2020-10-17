package array;

public class ImageSmoother {

  public static void main(String[] args) {
    new ImageSmoother().imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
  }

  public int[][] imageSmoother(int[][] M) {

    int[][] result = new int[M.length][M[0].length];
    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[0].length; j++) {
        int count = 0;
        for (int k = i - 1; k <= i + 1; i++) {
          for (int l = j - 1; j <= j + 1; j++) {
            if (k >= 0 && k <= M.length || l >= 0 && l <= M[0].length) {
              result[i][j] += M[k][l];
              count++;
            }
          }
        }
        result[i][j] /= count;
      }
    }
    System.out.println(result);
    return result;

  }
}
