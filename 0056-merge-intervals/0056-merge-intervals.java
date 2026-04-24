class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        for(int right = 1; right < intervals.length; right++){
            if(intervals[right][0] > intervals[left][1]){
                left++;
                intervals[left] = intervals[right];
            }
            else {
                intervals[left][1] = Math.max(intervals[left][1], intervals[right][1]);
            }
        }
        return Arrays.copyOfRange(intervals, 0, left + 1);
    }
}