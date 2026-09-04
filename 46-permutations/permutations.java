//recursive approch 
class Solution {

    private void recurPermute(int[]nums,List<Integer>ds,List<List<Integer>>ans,boolean[] freq){
        if(ds.size()==nums.length){//ds=n[arr size]
            ans.add(new ArrayList<>(ds));//one of permutation
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){//if it is not m arked then add
                freq[i]=true;
                ds.add(nums[i]);//add in ds
                recurPermute(nums,ds,ans,freq);//build remaining
                ds.remove(ds.size()-1);//now remove and marked false ;;back track
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();//cur permutation ds
        boolean freq[]=new boolean[nums.length];//freq arr similar size given arr initilly false h
        recurPermute(nums,ds,ans,freq);//recc srt
        return ans;
    }
}