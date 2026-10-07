class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
        return 0;

        int l=0; int h=nums.length-1;
        while(l<h){
            int mid = l + (h - l) / 2;
            //middle p check if woh pealk(as ager first or last elmt ka koi neighbor nhoi hota so thts why mid==0 kiya left ka koi neighbor nhi h asasame as left)
            if( (mid==0 || nums[mid]>nums[mid-1] )&& (mid==nums.length-1||nums[mid]>nums[mid+1] ))
            return mid;
        
        if(nums[mid]<nums[mid+1]){//left ko discard as mid seh left k chote h//reight seh bhardha h tof right discard
          l=mid+1; 
        }else{//reight seh bhardha h tof right discard
            h=mid;
        }
        }
        return l;
    }
}