class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {//for sellecting i\
            if(i>0 && nums[i]==nums[i-1] )//ager same hai to skip
            continue; 

            for(int j=i+1;j<nums.length-2;j++){//not select j
                if (j > i + 1 && nums[j] == nums[j - 1]) {// Skip duplicate j
                    continue;
                }
                int p=j+1;int q=nums.length-1;

                while(p<q){
                    long  sum=(long) nums[i]+ nums[j] + nums[p] + nums[q];

                    if(sum<target){
                        p++;
                    }else if(sum>target){
                        q--;
                    }else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) //skip for p
                        p++;
                    }
                }
            }
            
       }

    return ans;
               
    }
}

