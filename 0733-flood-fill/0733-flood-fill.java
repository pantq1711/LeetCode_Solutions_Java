class Solution {
        static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public void dfs(int[][] grid, int i, int j, int oldColor, int newColor){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != oldColor || oldColor == newColor) return ;

        grid[i][j] = newColor;

        for(int k = 0; k < 4; k++){
            dfs(grid, i + dx[k], j + dy[k], oldColor, newColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, oldColor, color);
        return image;
    }
}