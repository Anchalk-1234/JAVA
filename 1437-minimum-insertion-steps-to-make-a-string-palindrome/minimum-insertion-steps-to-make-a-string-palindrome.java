class Solution {
      int[][] t = new int[501][501];
            int solve(int i, int j, String s) {

                if(i >= j)
                    return 0;

                if(t[i][j] != -1)//alredy calculated
                    return t[i][j];

                if(s.charAt(i) == s.charAt(j))//same char so move ahed
                    return t[i][j] = solve(i+1, j-1, s);

                return t[i][j] = 1 + Math.min(solve(i, j-1, s), solve(i+1, j, s)); //nhi hai to mion nikloh
            }
            public int minInsertions(String s) {
                int n = s.length();

             for (int i = 0; i < 501; i++) {// we  fill it with -1
                       for (int j = 0; j < 501; j++) {
                        t[i][j] = -1;
                        }
                    }

                return solve(0, n-1, s);

    }
} 