class Solution {
    public int heightChecker(int[] heights) {
        int[] cnt = new int[101];
        for(int num : heights) cnt[num]++;
        int res = 0, start = 0, left = 0;
        for(int i = 0; i < heights.length; i++){
            while(cnt[start] == 0){
                start++;
            }
            if(start != heights[i]) res++;
            cnt[start]--;
        }
        return res;
    }
}