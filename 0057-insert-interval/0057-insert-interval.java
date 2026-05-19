class Solution {
public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> res = new ArrayList<>();
    int left = 0;
    int n = intervals.length;
    while(left < n && intervals[left][1] < newInterval[0] ){
            res.add(intervals[left]);
            left++;
    }
    while(left < n && intervals[left][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[left][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[left][1]);
            left++;
    }
    res.add(newInterval);
    while(left < n){
        res.add(intervals[left++]);
    }
        return res.toArray(new int[res.size()][]); 
}






}