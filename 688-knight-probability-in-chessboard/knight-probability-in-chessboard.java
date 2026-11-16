class Solution {
    HashMap<String, Double> mp = new HashMap<>();//store alredy calculated posibltiy
    
    int[][] directions = {
        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
        {2, 1}, {2, -1}, {-2, 1}, {-2, -1}
    };

    public double helper(int N, int K, int row, int col) {

        if (row < 0 || row >= N || col < 0 || col >= N) {//out of board
            return 0;
        }
        if (K == 0) {//sare moves chl g or cess k ander ho
            return 1;
        }
        // Create unique key
        String key = K + "_" + row + "_" + col;

        if (mp.containsKey(key)) {//if state was alrdy calculated return prob
            return mp.get(key);
        }
        double ans = 0;
        for (int[] dir : directions){//8 direction 
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            ans += helper(N, K - 1, newRow, newCol);
        }
        // Store and return probability
        mp.put(key, ans / 8.0);
        return mp.get(key);
    }

    public double knightProbability(int n, int k, int row, int column) {
        mp.clear();//prev store vlaue rempove
        return helper(n, k, row, column);//recursion srt
    }
}