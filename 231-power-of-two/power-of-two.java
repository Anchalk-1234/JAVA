class Solution {
    public boolean isPowerOfTwo(int n) {
     return n > 0 && (n & (n - 1)) == 0;//do true hona chye as pos ho&& n or n-1 ka and set bit(1) hona chyeh
  }
}