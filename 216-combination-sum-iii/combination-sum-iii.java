class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> result = new ArrayList<>();//sare valib combination stor
        List<Integer> temp = new ArrayList<>();//curr cobonatation store karega
       
         solve(1, k, n, temp, result);
        return result;
    }

    public void solve(int index, int k , int target,List<Integer> temp,List<List<Integer>> result) {

      // Exactly k numbers selected and target achieved
        if (temp.size() == k && target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
         if (temp.size() >= k || target <= 0) {//alredy selct k no,target alredy0/-ve
            return;
        }
        for (int i = index; i <= 9; i++) {

        // Pick current element (can pick again)
        if (i > target) {
            break;
        }
            temp.add(i);//curr elmt pick
            solve(i + 1, k, target - i, temp, result);//recursive call as same idx dubra use nhi
            
            temp.remove(temp.size() - 1);//back tarck picked elmt remove
        }

    }
}