class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int dfs(int[][] grid, int i, int j){
        int area = 0;
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 0;

        grid[i][j] = 0;
        area++;

        for(int k = 0; k < 4; k++){
            area += dfs(grid, i + dx[k], j + dy[k]);
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    res = Math.max(res,dfs(grid, i, j));
                }
            }
        }
        return res;
    }
}