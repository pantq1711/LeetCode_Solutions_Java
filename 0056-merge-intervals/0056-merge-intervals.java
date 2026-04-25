class Solution {
    public int[][] merge(int[][] intervals) {
                Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        for(int right = 1; right < intervals.length; right++){
            int start_next = intervals[right][0];
            if(intervals[left][1] < start_next){
                left++;
                intervals[left] = intervals[right];
            }
            else intervals[left][1] = Math.max(intervals[right][1], intervals[left][1]);
        }
        return Arrays.copyOfRange(intervals, 0, left + 1);
    }
}