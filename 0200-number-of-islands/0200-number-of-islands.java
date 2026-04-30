class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
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

    public void dfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';

        for(int k = 0; k < 4; k++){
            dfs(grid, i + dx[k], j + dy[k]);
        }
    }
}