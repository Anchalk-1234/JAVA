class Solution {
    public int sumOfUnique(int[] nums) {
         int[] freq = new int[101];//ik frequency arr banya jo 100 tak nb store kr sakta

        for (int num : nums) {//occ count kari
            freq[num]++;
        }

        int sum = 0;
        for (int num : nums) {//chaek kara unique h ki nhi abger 1 hai toh sum m add krdo
            if (freq[num] == 1) {
                sum += num;
            }
        }

        return sum;

    }
}