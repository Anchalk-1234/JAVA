class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);//sort acc to end values

        int count = 0;//kitne remove karne h
        int end = intervals[0][1];//store end of 1 inntervals

        for (int i = 1; i < intervals.length; i++) {//2 seh kiya cause 1  karra w ah

            // Overlap curr interval srt < end of intrrval jispe h
            if (intervals[i][0] < end) {
                count++;
            } 
            // No overlap
            else {
                end = intervals[i][1];
            }
        }

        return count;
    }
}