class Solution {
    public int minBitFlips(int start, int goal) {
    int N = start ^ goal;//xor kiya
    //and kiya as set bit find kiya n and n-1 ka jo chnge hua count + kiya
   int counter=0;
    while(N!=0){
        N=N & (N-1);
        counter++;
    }
    return counter;
    }
}