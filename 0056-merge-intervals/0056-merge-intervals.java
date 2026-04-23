class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
                Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] curInterval = intervals[0];
        int left = 0;
        res.add(curInterval);
        for(int[] next : intervals){
            int cur_end = curInterval[1];
            int next_start = next[0];
            int next_end = next[1];
            if(cur_end < next_start){
                curInterval = next;
                res.add(curInterval);
            }
            else {
                                curInterval[1] = Math.max(cur_end, next_end);

                cur_end = Math.max(cur_end, next_end);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}