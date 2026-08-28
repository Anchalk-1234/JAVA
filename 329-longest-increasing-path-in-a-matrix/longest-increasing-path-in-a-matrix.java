class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] memo = new int[matrix.length][matrix[0].length];//initailly zero h

        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,lip(matrix,i,j,memo));//recursive acall fun
            }
        }
return max;
    }
   private int lip(int[][] matrix, int i, int j, int[][] memo) {
    
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length)
        return 0;

        if(memo[i][j]>0)//value fild
        return memo[i][j];
int currentmax=1;
        //down neighbor helpful neighbor
        if(i+1<matrix.length && i+1>=0 && matrix[i+1][j]>matrix[i][j]){
            currentmax=Math.max(currentmax, 1+lip(matrix,i+1,j,memo));
        }
        //right neighbor
        if(j+1<matrix[0].length && j+1>=0 && matrix[i][j+1]>matrix[i][j]){
            currentmax=Math.max(currentmax, 1+lip(matrix,i,j+1,memo));
        }
        //left neighbor
        if(j-1<matrix[0].length && j-1>=0 && matrix[i][j-1]>matrix[i][j]){
            currentmax=Math.max(currentmax, 1+lip(matrix,i,j-1,memo));
        }
         //top neighbor 
        if(i-1<matrix.length && i-1>=0 && matrix[i-1][j]>matrix[i][j]){
            currentmax=Math.max(currentmax, 1+lip(matrix,i-1,j,memo));
        }
        memo[i][j]=currentmax;//store ans
        return currentmax;
    }
}