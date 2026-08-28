class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    int count = 0;
//itrate each cell
    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == '1') {
          dfs(grid, i, j);//if there s 1 do dfs
          count++;//we have found a island count++
        }

    return count;
  }

  private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
      return;            
    }
    grid[i][j] = '0'; // mark cell vistited as it behave now as water body

    // Explore all four direction
    dfs(grid, i + 1, j);//right botton left top
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }

}