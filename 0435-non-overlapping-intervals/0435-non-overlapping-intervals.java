class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int valid_meetings = 1; 
        int cur_end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= cur_end) {
                valid_meetings++;
                cur_end = intervals[i][1];
            }
        }

        return intervals.length - valid_meetings;
    }
}