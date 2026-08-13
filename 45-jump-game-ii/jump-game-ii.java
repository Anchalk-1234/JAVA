class Solution {
    public int jump(int[] nums) {
         int jump =0; //kitni jump li
    int currReach = 0;  //sabseh phle 0 p hai or jitne jump lenge poss ageh badegi
    int maxReach =0;  //harr index p dekenge konsi better destination mil sakti hai
    
    for(int i=0 ; i<nums.length-1 ; i++){
        
        maxReach = Math.max(maxReach,nums[i]+i); //2
        
        if(currReach==i){ //currReach==2 tabhi update hoga
        
        if (maxReach == i)
              return -1;
              
            currReach = maxReach; //2
            jump++;
        }
    }
     return jump;
    }
}