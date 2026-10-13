class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();//store final result of non overlapping intevals
        int i = 0;

        // Add intervals before newInterval (as uslo result m daldeya jo overlap n hora)
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals (srting hogi min value of all overlapping intervals as end m max)
        while (i < intervals.length &&intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);//add merge interval
        // Add remaining intervals
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);//converting list to int
    }
}