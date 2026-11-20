class Solution {
     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
    int[][] grid = new int[m][n];//initialize memo store this are ways

     // If starting cell has obstacle
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){

                if (obstacleGrid[i][j] == 1) {//curr p obstecal h
                    grid[i][j] = 0;
                }
                else if (i == 0 && j == 0) {//srting cell sirf ek h trika h
                    grid[i][j] = 1;
                }
                else if (i == 0) {//first row hum right s askte so no ways qual h left cell k
                    grid[i][j] = grid[i][j - 1];
                }
                else if (j == 0) {//first col hum juper as akte so by miving down
                    grid[i][j] = grid[i - 1][j];
                }
                // Remaining cells
                else {
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                }
            }
        }
    return grid[m - 1][n - 1];//no of ways to rech last cell -1 bcs zero base indexing  
    }
}  
    
