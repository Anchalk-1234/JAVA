class Solution {
     int m;//rows colm word length
    int n;
    int l;

    int[][] directions = {
        {1, 0},   // down
        {-1, 0},  // up
        {0, 1},   // right
        {0, -1}   // left
    };
  boolean find(char[][] board, int i, int j, String word, int idx) {
        if(idx >= l)//word complete
            return true;
        
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(idx))//base case dala
            return false;
   
        char temp = board[i][j];
        board[i][j] = '$';//visiterd mark            
        
        for(int[] dir : directions) {//sare direction check ki
            int i_ = i + dir[0];//next cell calculate
            int j_ = j + dir[1];
            
            if(find(board, i_, j_, word, idx+1))//word keh next idx m badengeh    //dfs kiya     
                return true;
        }
        
        board[i][j] = temp;//vback track direction bnot work so come to srt
        return false;
    }
    
   public boolean exist(char[][] board, String word){
        m = board.length;
        n = board[0].length;
        l = word.length();
        if(m*n < l)//ager board chota hai
            return false;
        
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(board[i][j] == word.charAt(0) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}