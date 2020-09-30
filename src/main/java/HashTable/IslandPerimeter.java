package HashTable;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int peri = 0;
        for(int i =0; i < grid.length;i++ ) {
            for (int j=0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    if(j > 0 && grid[i][j-1] != 0) peri--;
                    if(j < grid[i].length-1 && grid[i][j+1] != 0) peri--;
                    if(i >0 && grid[i-1][j] != 0) peri--;
                    if(i < grid.length-1 && grid[i+1][j] != 0) peri--;
                    sum+= peri;
                    peri=4;
                }
            }
        }
        return sum;
    }
}
