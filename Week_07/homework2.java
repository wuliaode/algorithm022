 //200. 岛屿数量
 
class Solution {
    private int M;
    private int N;
    
    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == M || j == N || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
    
    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid.length == 0) return res;
        
        this.M = grid.length;
        this.N = grid[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
}
