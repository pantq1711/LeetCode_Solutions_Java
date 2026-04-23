class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] curInterval = intervals[0];
        res.add(curInterval);
        for(int[] next : intervals){
            int cur_end_time = curInterval[1];
            int start_next = next[0];
            int end_next = next[1];
            if(cur_end_time < start_next){
                curInterval = next;
                res.add(curInterval);
            }
            else {
                curInterval[1] = Math.max(cur_end_time, end_next);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}