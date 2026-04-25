class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int curEnd = points[0][1];
        int k = 1;
        for(int i = 1; i < points.length; i++){
            if(curEnd < points[i][0]){
                k++;
                curEnd = points[i][1];
            }
        }
        return k;
    }
}