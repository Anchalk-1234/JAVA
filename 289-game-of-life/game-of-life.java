class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m= board[0].length;
        int[][] clone=new int[n][m];//create clone mat
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                clone [i][j]=board[i][j];//clone m boatd k elmt dal dengeh
            }
        }
        for(int i=0;i<n;i++){//every cell visit
            for(int j=0;j<m;j++){
                if(clone[i][j]==1){
                    int live = findlive(i, j, clone);
                    if(live==2 || live==3){//uske kitne live neighor h
                    board[i][j]=1;
       
                }else{
                    board[i][j]=0;
                }
                }else{
                    if(findlive (i,j,clone)==3 )
                    board[i][j]=1;
                    else
                    board[i][j]=0;
                }
                }
            }
    }
    
       //live nabour clculate
        private int findlive(int i,int j,int[][] board){
            int live=0;
            int n=board.length;
          int m= board[0].length;
            if(i+1<n && board[i+1][j]==1)//down
            live++;
            if(j+1<m && board[i][j+1]==1)//right
            live++;
            if(i-1>=0 && board[i-1][j]==1)//up
            live++;
            if(j-1>=0 && board[i][j-1]==1)//left
            live++;
            //for horizontal nabours
            if(i+1<n && j+1<m && board[i+1][j+1]==1)//diagonal down right
            live++;
            if(i+1<n && j-1>=0 && board[i+1][j-1]==1)//diagonal down left
            live++;
            if(i-1>=0 && j+1<m &&board[i-1][j+1]==1)//diagonal up rihht
            live++;
           if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1)//diagonal up left
            live++;
            return live;
        }


    
}