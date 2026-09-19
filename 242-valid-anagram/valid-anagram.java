class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
  int[] freq = new int[26];
        for (char c : s.toCharArray()) {//count char of s then t keh leye dec 
            freq[c - 'a']++;//a-a=0so++
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        //check if all emnt in count is zero
        for (int count : freq) {
         if (count != 0) {
                return false;
            }
        }

        return true;
    }
}