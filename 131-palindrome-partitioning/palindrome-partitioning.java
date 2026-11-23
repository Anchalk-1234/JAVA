class Solution {
    List<List<String>> result;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();//store vlaid paritions //temp curr partion
        solve(0, s, new ArrayList<>());
        return result;
    }
    public void solve(int index, String s, List<String> temp) {
        if (index == s.length()) {//reach end and store in curr partion
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String curr = s.substring(index, i + 1);//every possible substring

            if (isPalindrome(curr)) {//check plaindrome
                temp.add(curr);
                solve(i + 1, s, temp);//next idx move cuse curr alredy been used
                temp.remove(temp.size() - 1);//remove for backtrack 
        }
    }
    }
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}