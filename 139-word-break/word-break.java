class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
         // Convert the dictionary to a set for O(1) lookups
       Set<String> wordSet = new HashSet<>(wordDict);  //convert in hash set for quicker looks ups

          // Find the maximum word length in the dictionary
          int maxLen = 0;
          for (String word : wordDict) {//iteate each word and uopdate max length value  4
            maxLen = Math.max(maxLen, word.length());
          }

          int n = s.length();
          // dp[i] states if the substring s[0..i] can be segmented
          boolean[] dp = new boolean[n + 1];//dp at each pos if it can b segmented

          // Base case: empty string is valid
          dp[0] = true;

          for (int i = 1; i <= n; i++)

            // Check prefixes of length up to maxLen
            for (int j = i - 1; j >= Math.max(0, i - maxLen); j--)//iterate each char and go back max 4 char
              if (dp[j] && wordSet.contains(s.substring(j, i))) {//find word update value
                dp[i] = true;
                break; // No need to check further prefixes
              }

          return dp[n];
    }
}