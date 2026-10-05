class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            for (int num : nums) {
                sum= sum+(num + mid - 1) / mid;//java ceeling value deta h so we use it
            }

            if (sum <= threshold) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}