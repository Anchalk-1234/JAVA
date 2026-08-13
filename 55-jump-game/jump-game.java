class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;//we are at index 0 srt p
         for (int i = 0; i < nums.length; i++) {
            if (i > maxReach)
                return false;

            maxReach = Math.max(maxReach, i + nums[i]);
        }//maxReach = 4 curnt index 2 num[2] =5;;2 + 5 = 7 Math.max(4,7);

        return true;


     }
} 
    