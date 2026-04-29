class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int left = 0;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > intervals[left][1]){
                left++;
                intervals[left] = intervals[i];
            }
            else {
                intervals[left][1] = Math.max(intervals[i][1], intervals[left][1]);
            }
        }
        return Arrays.copyOfRange(intervals, 0, left + 1);
    }
}