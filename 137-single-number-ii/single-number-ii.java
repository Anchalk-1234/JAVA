class Solution {
    public int singleNumber(int[] nums) {
        int ones =0;
        int twos=0;

        for(int num : nums){
        ones = (ones  ^ num) & ~twos; //xor it and ensure twos sm nhi h
       twos = (twos ^ num) & ~ones;//first off try to add in twos and remove in ones
        }
       return ones;
    }
}