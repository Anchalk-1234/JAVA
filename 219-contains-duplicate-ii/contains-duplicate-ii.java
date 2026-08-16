class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashSet<Integer> set=new HashSet<>();
          for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){//check duplicaQTE
                return true;
            }
            set.add(nums[i]);//CURR ELMT ADD KIYA asger nhi h toh
           
            if (set.size() > k) {//maintain window k
                set.remove(nums[i - k]);
            }
    }    
          return false;  
    }
}