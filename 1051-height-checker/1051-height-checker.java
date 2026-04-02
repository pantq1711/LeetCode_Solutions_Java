class Solution {
    public int heightChecker(int[] heights) {
        int cnt[] = new int[101];
        for(int num : heights) cnt[num]++;
        int curHeight = 0;
        int countMatch = 0;
        for(int num : heights){
            while(cnt[curHeight] == 0) ++curHeight;
            if(curHeight != num) countMatch++;
            cnt[curHeight] --;
        }
        return countMatch;
    }
}