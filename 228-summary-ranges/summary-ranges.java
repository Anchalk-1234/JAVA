class Solution {
    public List<String> summaryRanges(int[] nums) {
          List<String> ans = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int start = nums[i];//save the starting pint

            // Extend the range
            while (i < n - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];//save ending point

            if (start == end) {//save the ending point
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + end);
            }
        }

        return ans;
    }
}
    
