class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == '1' && !visited[row][col]){
                    count++;
                    fill(visited, grid, row, col);
                }
            }
        }
        return count;
    }
    private void fill(boolean[][] visited, char[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= visited.length || c >= visited[0].length || grid[r][c] == '0' || visited[r][c]){
            return;
        }
        visited[r][c] = true;
        fill(visited, grid, r+1, c);
        fill(visited, grid, r-1, c);
        fill(visited, grid, r, c+1);
        fill(visited, grid, r, c-1);
    }
}
