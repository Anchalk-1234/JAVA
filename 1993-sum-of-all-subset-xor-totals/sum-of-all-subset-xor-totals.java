class Solution {
    public int subsetXORSum(int[] nums) {
        int result = 0;

        for (int num : nums) {//or nikdi sare elmts ka
            result |= num;
        }

        return result << (nums.length - 1);//append last m n-1 times 0 (As left shift)
    }
}