class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> helperStack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length-1; i >= 0; i--) {
            int element = nums2[i];
// Remove all smaller or equal elements
            while (!helperStack.isEmpty() && helperStack.peek() <= element) {
                helperStack.pop();
            }

            // Store next greater element
            if (helperStack.isEmpty()) {
                map.put(element, -1);
            } else {
             map.put(element, helperStack.peek());//if not empty cherck  and put 1 largest
            }
            helperStack.push(element); // Push current element
        }
        // Prepare answer for nums1
        int[] ans = new int[nums1.length];//create ans aarr
        for (int i = 0; i < nums1.length; i++) {
        ans[i] = map.get(nums1[i]);//trsver nums1  and get next grestst
        }

        return ans;
    }
}