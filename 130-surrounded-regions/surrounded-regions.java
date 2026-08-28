class Solution {
    public void solve(char[][] board) {
         int rows = board.length;
        int cols = board[0].length;
        //trnsverse 1  last col if any contain 0 srt dfs
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);

            if (board[i][cols - 1] == 'O')
                dfs(board, i, cols - 1);
        }

        // First and last row
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);

            if (board[rows - 1][j] == 'O')
                dfs(board, rows - 1, j);
        }

        // Flip surrounded O to X
        // Restore # to O
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '#')
                    board[i][j] = 'O';//boundry wale fir s O
            }
        }
    }

    public void dfs(char[][] board, int r, int c) {
        int rows = board.length;
        int cols = board[0].length;
        if (r < 0 || c < 0 || r >= rows || c >= cols)
            return;
        if (board[r][c] != 'O')
            return;//stop is notO
           board[r][c] = '#';//insted of chnging we mark it

        dfs(board, r - 1, c);//up down left right
        dfs(board, r + 1, c);
        dfs(board, r, c - 1);
        dfs(board, r, c + 1);

    }
}