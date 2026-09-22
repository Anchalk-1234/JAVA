class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
         int count = 0;

        for (int num : nums) {//count freq of each no
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {//tnsvers unique char as from key
            if (k == 0) {
                if (map.get(num) >= 2){//jiski frq 2 yah doh s jayda hogi uslo return karadogh thts ans
                    count++;
                }
            } 
            else {//if its not eqyual to 0 than +k so count++
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}