class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rows = n;
        int cols = n;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int val = 1;
        while(left <= right && top <= bottom){
            for(int j = left; j <= right; j++){
                res[top][j] = val++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res[i][right] = val++;
            }
            right--;
            if(left > right || top > bottom) return res;
            for(int j = right; j >= left; j--){
                res[bottom][j] = val++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                res[i][left] = val++;            }
            left++;
        }
        return res;
    }
}