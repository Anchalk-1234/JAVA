class Solution {
    public int totalNQueens(int n) {
    
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');//fill every row with.
        }
        return solve(0, board, n);//call recursive
       
    }

//placed queen reursivly
    public int solve(int row, char[][] board, int n) {
        if (row == n) {// All queens placed
           return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {//sare cloum p check kiya in curr row
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';//queen placed
               count+= solve(row + 1, board, n);
                board[row][col] = '.';//baltrack or ab queen hatadi
            }
        }
         return count;
    }
  
    
//check queen place jaga safe h k nhi
    public boolean isSafe(int row, int col,char[][] board, int n) {
        for (int i = 0; i < row; i++) {//same col we check prev rows in same col
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal jab tak bourdy rech (k ley -1 karte h)
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        return true;  
    }
}
    
