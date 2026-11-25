
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int x : nums) {//ttl sum calculate
            sum += x;
        }
        if (sum % k != 0) {//if not equal subset not possible
            return false;
        }
        int target = sum / k;//har subset requied target sum
       Arrays.sort(nums);
        if (nums[nums.length - 1] > target) {//elmt target sbadha h toh fit ni hoskta
            return false;
        }
        boolean[] visited = new boolean[nums.length];//track which elmt is usd alredy
        return solve(nums, visited, k, 0, 0, target);
    }

    public boolean solve(int[] nums, boolean[] visited,int k, int index, int currSum, int target) {

        // All subsets formed(ager 3 bana chke toh last automaticalyy taget sum ka hoga)
        if (k == 1) {
            return true;
        }
        // Current subset completed
        if (currSum == target) {
            return solve(nums, visited, k - 1, 0, 0, target);
        }

        for (int i = index; i < nums.length; i++) {
            if (!visited[i] && currSum + nums[i] <= target) {
                visited[i] = true;
                if (solve(nums, visited, k, i + 1,currSum + nums[i], target)) {//add sum jo target s exeed n ho
                    return true;
                }
                // Backtracking(ager selcted s valid ans nhi mila unselct)
                visited[i] = false;
            }
        }
        return false;
    }
}
