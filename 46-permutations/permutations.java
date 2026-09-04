//recursive approch wih out map
class Solution {

    private void recurPermute(int index,int[]nums,List<List<Integer>>ans){
        if(index==nums.length){
            List<Integer>ds=new ArrayList<>();//create ds
            for(int i=0;i<nums.length; i++){
                ds.add(nums[i]);//copy nums to sds
            }//idx means which pos we are tring to fix
            ans.add(new ArrayList<>(ds));//add lidt in ds
            return;
        }
        for(int i=index;i<nums.length;i++){//swap till ind to n-1
            swap(i,index,nums);//put slct iteam to curr idx
            recurPermute(index+1,nums,ans);//back track sec ond choice ;;;recursive callll
            swap(i,index,nums);//reswap
        }
    }
     private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        recurPermute(0,nums,ans);//recc srt from 0 
        return ans;
    }
}