class Solution {
    public int[] leftRightDifference(int[] nums) {
    int rightSum = 0;
    int leftSum = 0;
    for (int num : nums) { // Calculate the total right sum by adding all elements
      rightSum += num;
    }

    for (int i = 0; i < nums.length; i++) {//ittarte thrugh arr
      // Get the value at index i
      int val = nums[i];

      rightSum -= val;  // Update the right sum

      // Find the difference
      nums[i] = Math.abs(leftSum - rightSum);
      leftSum += val; // Update the left sum
    }
    return nums;
    }
}