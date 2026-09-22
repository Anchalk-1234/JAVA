class Solution {
    public int mySqrt(int x) {
         long  low=0; long high=x; long  mid=0; int ans=1;//long can handel large values
       while(low<=high){
            mid=(low+high)/2;
          
            if(mid*mid<=x){
                ans = (int)mid;
                low = mid + 1;
           }
           else{
               high=mid-1;
           }
       }
       return ans;
    }
}