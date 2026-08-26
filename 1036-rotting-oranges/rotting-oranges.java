class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)//no value av 
        return-1;
        //make a helper grid
        int r=grid.length; int c=grid[0].length;
        int[][] time = new int[r][c];//time arry cfeate

        for(int i=0; i<r;i++)
        Arrays.fill(time[i],Integer.MAX_VALUE);//ingite kara jah b orange h
//input grid m itrate
        for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
        if(grid[i][j]==2){//if we find 2 apply dfs we send few detils time positon i j ans curr time
        dfs(grid, time,i,j,0);
        }
        }
        }
    //itate over time grid if any infinite value found return -1
 int timeRequired = 0;
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        if (grid[i][j] == 1) {
          if (time[i][j] == Integer.MAX_VALUE) return -1;
          timeRequired = Math.max(timeRequired, time[i][j]);
        }
      }
    }

    return timeRequired;
  


    }
     private void dfs(int[][] grid, int[][] time, int i, int j, int currentTime) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
        || grid[i][j] == 0 || currentTime >= time[i][j]) return;

    time[i][j] = currentTime;//all 4 direction m jake rot kaenge with +value     
    dfs(grid, time, i - 1, j, currentTime + 1);
    dfs(grid, time, i + 1, j, currentTime + 1);
    dfs(grid, time, i, j - 1, currentTime + 1);
    dfs(grid, time, i, j + 1, currentTime + 1);
  }
} 