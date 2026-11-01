class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(n == 0)
        return true;

        for(int i = 0; i<l; i++) {
            if(flowerbed[i] == 0) {
            boolean leftEmpty   = (i == 0) || (flowerbed[i-1] == 0);////left kahli h toh
                
            boolean rightEmpty  = (i == l-1) || (flowerbed[i+1] == 0);//right khali h
                if(leftEmpty && rightEmpty) {
                 flowerbed[i] = 1;//toh flower pace krdoh
                 n--;
                if(n == 0)//afer zero hogya toh
                return true;
                } 
            }
        }
        return false;
    }
}