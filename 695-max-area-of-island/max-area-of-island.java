class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
    int ans=0;//store max area

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){//iland found perform dfs
                int area=dfs(grid,i,j,n,m);//islamd ka rea find kra
                ans=Math.max(ans,area);//max h to update 
            }
        }
    } return ans;
    }
    public  boolean isValid(int[][] grid, int i,int j,int n,int m){
     return (i>=0 && i<n && j>=0 && j<m && grid[i][j]==1);
    }

    public int dfs(int[][] grid, int i, int j, int n, int m) {
       
        grid[i][j]=0; int area=1;

         if (isValid(grid, i + 1, j, n, m))//down up right left
            area += dfs(grid, i + 1, j, n, m);

        if (isValid(grid, i - 1, j, n, m))
            area += dfs(grid, i - 1, j, n, m);

        if (isValid(grid, i, j + 1, n, m))
            area += dfs(grid, i, j + 1, n, m);

        if (isValid(grid, i, j - 1, n, m))
            area += dfs(grid, i, j - 1, n, m);

   
    return area;
}
}