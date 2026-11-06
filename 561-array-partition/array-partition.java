class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);//sort in ass order

        int sum = 0;//stoe the min elmt of pair
        for (int i = 0; i < nums.length; i += 2) {//inc by 2
            sum += nums[i];//phla elemt h sum kro cause wohe chta hoga i+1 seh
        }
        return sum; 
    }
}