class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();//sare valib combination stor
        List<Integer> temp = new ArrayList<>();//curr cobonatation store karega

        solve(0, candidates, target, temp, result);
        return result;
    }

    public void solve(int index, int[] arr, int target,List<Integer> temp,List<List<Integer>> result) {

        if (target == 0) {//target achived add in resilt
            result.add(new ArrayList<>(temp));
            return;
        }
        if (index == arr.length) {//sare elmt check hoge or taget b 0 nhi h
            return;
        }

        // Pick current element (can pick again)
        if (arr[index] <= target) {
            temp.add(arr[index]);//curr elmt chose
            solve(index, arr, target - arr[index], temp, result);//wsar indx f=dobhara beja cuse same multiple times
            
            temp.remove(temp.size() - 1);//back tarck picked elmt remove
        }

        // Not pick current element
        solve(index + 1, arr, target, temp, result);
    }
}
