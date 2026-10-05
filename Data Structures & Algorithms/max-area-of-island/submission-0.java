class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int area = 0;

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1 && !visited[row][col]){
                    area = Math.max(countArea(grid, visited, row, col), area);
                }
            }
        }
        return area;
    }

    private int countArea(int[][] grid, boolean[][] visited, int r, int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || visited[r][c]){
            return 0;
        }
        visited[r][c] = true;
        return 1 + countArea(grid, visited, r + 1, c) + 
            countArea(grid, visited, r - 1, c) + 
            countArea(grid, visited, r, c+1) + 
            countArea(grid, visited, r, c-1);
    }
}
