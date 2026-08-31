class Solution {
    public int islandPerimeter(int[][] grid) {
       int row=grid.length;
       int col= grid[0].length;

       int count =0;//peri ka count store hoga
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]==0)
            continue;
            //top bottom left right water hai toh count++ as island milgya
            if(i==0 ||grid[i-1][j]==0)
            count++;
            if(i==row-1 || grid[i+1][j]==0)//last row r-1
            count++;
            if(j==0 ||grid[i][j-1]==0)
            count++;
            if(j==col-1 || grid[i][j+1]==0)
            count++;
        }
       }
       return count;

    }
}