class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0;
       int n=mat.length;
       //get sum of both diagonal
       for(int i=0;i<n;i++){
        sum+=mat[i][i];//add 1 ;left daigonal
        sum+=mat[i][n-i-1];//3-0-1=2 elmt 3 ;; right elmt
       } 
       if(n%2!=0){//if mat is odd sub duplicate(middle lemt)
        sum-=mat[n/2][n/2];
       }
return sum;
    }
}