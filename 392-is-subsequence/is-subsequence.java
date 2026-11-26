class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;//s seh char mil gya
            }
            j++;//haar condition m hoga cause j ko agian gain travers ekarn h
        }

        return i == s.length();//s k sare chr mil gye
    }
}
