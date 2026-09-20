class Solution {
    public int characterReplacement(String s, int k) {
    int[] freq = new int[26];//calculate freq
    int left = 0;//srting point of window
    int maxFreq = 0;
    int maxWindow = 0;

    for (int right = 0; right < s.length(); right++) {
      freq[s.charAt(right) - 'A']++;// Update the frequency of the current character
      maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);// Update the max frequency

      int windowLength = right - left + 1;//zero based indexing in arr

      // If the windowLength - max frequency > k,
      // then we need to shrink the window
      if (windowLength - maxFreq > k) {
        freq[s.charAt(left) - 'A']--;
        left++;
      }
      windowLength = right - left + 1;
      maxWindow = Math.max(maxWindow, windowLength);
    }

    return maxWindow;
    }
}