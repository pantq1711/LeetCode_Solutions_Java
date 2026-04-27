class Solution {
        static int[] dx = {-1, 1, 0, 0};
        static int[] dy = {0, 0, -1, 1};
    private int dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 0;
        int cnt = 1;

        grid[i][j] = 0;

        for(int k = 0; k < 4; k++){
            cnt += dfs(grid, i + dx[k], j + dy[k]);
        }
        return cnt;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    res = Math.max(dfs(grid, i, j), res);
                }
            }
        }
        return res;
    }
}