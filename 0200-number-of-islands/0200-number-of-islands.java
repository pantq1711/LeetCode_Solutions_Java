class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int cnt = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    cnt++;
                    dfs(grid, i, j);
                }
            }
        }
        return cnt;
    }

    private void dfs(char[][] grid, int i, int j){
        grid[i][j] = '0';

        for(int k = 0; k < 4; k++){
            int new_i = i + dx[k];
            int new_j = j + dy[k];

            if(new_i >= 0 && new_j >= 0
                    && new_i < grid.length && new_j < grid[0].length
                    && grid[new_i][new_j] == '1'){
                dfs(grid, new_i, new_j);
            }
        }
    }
}