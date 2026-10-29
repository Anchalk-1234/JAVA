class Solution {
    public int countTriplets(int[] nums) {
        int limit = 1 << 16;
        int[] freq = new int[limit];

        for (int a : nums) {//1 no selct kiya
            for (int b : nums) {
                freq[a & b]++;// freq update
            }
        }
        int count = 0;//valid triplatre
        for (int c : nums) {//3 select kiya
            for (int mask = 0; mask < limit; mask++){//har possible pair wise b ko check karta h
              if ((c & mask) == 0) {//ager o hai to add kiya
                    count += freq[mask];
                }
            }
        }
        return count;
    }
}
