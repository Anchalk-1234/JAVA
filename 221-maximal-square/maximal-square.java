class Solution {
    public int maximalSquare(char[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows][cols];//crete dp and all is initilize by 0
    int maxSide = 0;//track of max value find

    // dp table fill
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == '1') {

          // 1 row and 1 col l leye 1 kardoh cause nabur nhi h
          if (i == 0 || j == 0)
            dp[i][j] = 1;
          else
            // oro k leye min 
            dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);

          maxSide = Math.max(maxSide, dp[i][j]);
        }
      }
    }

    // area of largest sq
    return maxSide * maxSide;
    }
}