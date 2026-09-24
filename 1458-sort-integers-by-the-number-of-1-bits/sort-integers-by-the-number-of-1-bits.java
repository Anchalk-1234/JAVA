class Solution {
    public int[] sortByBits(int[] arr) {
       Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {//int to integer data type chnge hua basss
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> {//a b ko compafr e kiya
            int countA = Integer.bitCount(a);;//5=101 ans=2 //one count hiora
            int countB = Integer.bitCount(b);
          //decending order m chye s diffrent sdet bit count
            if (countA != countB) {
                return countA - countB;
            }
            // Same set bits → smaller number first
            return a - b;
        }
        );
       //now integer to int
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr; 
    }
}