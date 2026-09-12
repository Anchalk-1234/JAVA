class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int[][] dp = new int[text1.length() + 1][text2.length() + 1];//cons matrix

           // Iterate over each cell and update values
           for (int i = 1; i <= text1.length(); i++)

             for (int j = 1; j <= text2.length(); j++)

               if (text1.charAt(i - 1) == text2.charAt(j - 1))//co,mmon mila toh vbertically oppp p +!
                 dp[i][j] = 1 + dp[i - 1][j - 1];
               else
                 dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);//if not same toh top or left max likdoh uska

           // Return the value in last cell
           return dp[text1.length()][text2.length()];
        
    }
}