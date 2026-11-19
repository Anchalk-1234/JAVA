class Solution {
    public boolean canPartition(int[] nums) {
          int sum = 0;//calculate total sim
        for (int num : nums) {
            sum += num;
        }
         // If sum is odd, partition is not possible
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];//create dp size target+1
        dp[0] = true;

        for (int i = 0; i < nums.length; i++) {
        for (int j = target; j >= nums[i]; j--) {//jab tak sum summler than curr elmt

            dp[j] = dp[j] || dp[j - nums[i]];//d[j]= dont pik curr elmt sum was possible; d[j-m= pick cur elmt if remaing sum possible            
        }
              }

        return dp[target];
    }
}