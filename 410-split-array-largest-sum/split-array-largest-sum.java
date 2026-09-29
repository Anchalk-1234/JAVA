class Solution {
    public int splitArray(int[] nums, int k) {
       int low = 0;
        int high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;//curr dsub arr sum
            int count = 1;//kitne sub arr ban chukeh

            for (int num : nums) {
                if (sum + num > mid) {//0+7>21 flase / 7+2=9
                    count++;//curr sub arr ful hua new banoh
                    sum = num;//ager chota h toh sum m add
                } else {
                    sum += num;//so sum m add hua
                }
            }
            if (count <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }
}