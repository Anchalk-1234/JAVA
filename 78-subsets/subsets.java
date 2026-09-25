class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> resultList = new ArrayList<>();//result list store all possible subset
    // Start backtracking from the beginning (empty arr list,orignal arr, srting point)
    backtrack(resultList, new ArrayList<>(), nums, 0);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,int[] nums, int start) {
    resultSets.add(new ArrayList<>(tempSet));//add curr subset to ans
    for (int i = start; i < nums.length; i++) {
      tempSet.add(nums[i]); //including the number
      // Backtrack the new subset
      backtrack(resultSets, tempSet, nums, i + 1);//explore
      tempSet.remove(tempSet.size() - 1); //not-including the number undo as backtrack
    }
}
}