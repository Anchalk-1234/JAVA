class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char ch : tasks) {//count freq
            freq[ch - 'A']++;
        }
         int maxFreq = 0;
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);//find max freq
        }

        // Count tasks with maximum frequency
        int maxCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxFreq) {
                maxCount++;
            }
        }
        int intervals = (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, intervals);
}
}