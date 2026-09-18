class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {//here i srts to find nedle
            int j = 0;//it represents needle
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {//3+0==0 b b // 3+1==1 u u//3+2==2t t
                j++;
            }
            if (j == m) {///meaans whole needle is found
                return i;
            }
        }
        return -1;
    }
}