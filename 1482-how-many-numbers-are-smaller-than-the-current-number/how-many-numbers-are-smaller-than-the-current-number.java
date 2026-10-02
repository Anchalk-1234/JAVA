class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] buckets = new int[102]; //crte buckets fr counting sort store freq of each emnt

    for (int num : nums) {//freq nikali sab ki
      buckets[num]++;
    }

    for (int i = 1; i < buckets.length; i++) {//acumulative sum count smaller  no than each elmt
      buckets[i] += buckets[i - 1];
    }

    int[] result = new int[nums.length];//create result arr as uska sum dekna hai nb ka 
    for (int i = 0; i < result.length; i++) {
      if (nums[i] == 0)//zero hjai toh use chota koi ho nahi sata
        result[i] = 0;
      else
        result[i] = buckets[nums[i] - 1];//count k leye 
    }

    return result;
    }
}