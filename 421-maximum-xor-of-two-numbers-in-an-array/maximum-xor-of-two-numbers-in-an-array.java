class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;//store max xor
        int mask = 0;//yeh decide karewga no k konmse bits ko check karna h

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);//genrate max
            HashSet<Integer> set = new HashSet<>();//holf prefix jo gernate kiya

            for (int num : nums) { 
                set.add(num & mask);
            }
            int temp = maxXor | (1 << i);//try curr bit 1 karen s max xor ban sakta h k nhi
            for (int prefix : set) {//no k masked prefix store h y check kare ga
                if (set.contains(prefix ^ temp)) {
                    maxXor = temp;//if poosivble so max xor upddates
                    break;
                }
            }
        }
        return maxXor;
    }
}