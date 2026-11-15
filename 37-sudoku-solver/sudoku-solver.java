class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {//row
            for (int j = 0; j < 9; j++) {//col
                if (board[i][j] == '.') {//find empty cell

                    for (char ch = '1'; ch <= '9'; ch++) {//try 1 to 9 digit
                        if (isValid(board, i, j, ch)) {
                            board[i][j] = ch;//place
                         
                            if (solve(board)) {//recursive call
                                return true;
                            }
                            // Backtracking as if ahed we find no digit can fit
                            board[i][j] = '.';
                        }
                    }
                    return false;//if 1 to 9 no works 
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[row][i] == ch) {
                return false;
            }
            // Check column
            if (board[i][col] == ch) {
                return false;
            }
            // Check 3x3 box
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;
            if (board[r][c] == ch) {
                return false;//if digit box m h
            }
        }
        return true;
    }
}