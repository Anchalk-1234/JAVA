class Solution {
    public boolean isPowerOfTwo(int n) {
    if(n==0)
    return false; 
    while(n!=1){
        if(n%2!=0){//rem 1 hai toh
        return false;
        }else{
            n=n/2;//ager rem o hai toh div karte raho
        }
    }
    return true;
  }
}