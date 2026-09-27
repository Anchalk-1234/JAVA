class Solution {
    public int arrangeCoins(int n) {
        long l=1,r=n;//int overflow seh bachne k leye use long coinnede much larger hoskta
        while(l<=r){
            long mid=l+(r-l)/2;
            long coinsneeded=mid*(mid+1)/2;
        if(coinsneeded==n){
            return(int) mid;
        }
            else if(coinsneeded<=n)
            l=mid+1;
            else
            r=mid-1;
        }
        return (int)l-1;//convert in int
    }
}