class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while(left <= right && top <= bottom){
            for(int j = left; j <= right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom) return res;
            for(int j = right; j >= left; j--){
                res.add(matrix[bottom][j]);
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}