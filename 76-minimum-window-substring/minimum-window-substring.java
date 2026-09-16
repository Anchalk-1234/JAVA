class Solution {
    public String minWindow(String s, String p) {
        // Count characters in s p char feq nikala
          int[] mapS = new int[256];//freq arr
          int[] mapP = new int[256];

          for (char ch : p.toCharArray())
            mapP[ch]++;

          String result = "";
          int right = 0, min = Integer.MAX_VALUE;//length of smallest window

          // Two pointers of the sliding window: i(left), right
          for (int left = 0; left < s.length(); left++) {

            while (right < s.length() && !isDesirable(mapS, mapP)) {
              mapS[s.charAt(right)]++;//inc right pointer populate map freq

              // Extend the right pointer of the sliding window
              right++;
            }

            if (isDesirable(mapS, mapP) && min > right - left) {//if it contains all char of p
              result = s.substring(left, right);
              min = right - left;
            }

            // Shrink the left pointer from i to i + 1
            mapS[s.charAt(left)]--;
          }

          return result;
        }

        // Runtime = O(256) = O(1)
        private static boolean isDesirable(int[] mapS, int[] mapP) {
          // s should cover all characters in t as if yes then return true
          for (int i = 0; i < 256; i++) {
            if (mapP[i] > mapS[i])
              return false;
          }
          return true;
    }
}