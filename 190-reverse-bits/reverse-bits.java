class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;//left shift kiua result ko cause naya pos ban jayre
            
            result |= (n & 1);//n&1 seh last bit basta kari tab or kiya result k slsb k sathath or result m append krya
            
            n >>>= 1;// right shift as n m lsb ko hatya
        }
        
        return result;
    }
}