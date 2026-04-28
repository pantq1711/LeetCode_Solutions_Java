class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix[0].length == 0) return res;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top > bottom || left > right) return res;

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