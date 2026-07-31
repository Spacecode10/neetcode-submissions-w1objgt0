class Solution {
    public int dfs(int[][] arr, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || visited[i][j] == true
            || arr[i][j] != 1) {
            return 0;
        }
        visited[i][j] = true;
        int count = 1;
        count = count + dfs(arr, visited, i, j - 1);
        count = count + dfs(arr, visited, i - 1, j);
        count = count + dfs(arr, visited, i, j + 1);
        count = count + dfs(arr, visited, i + 1, j);
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count = Math.max(dfs(grid, visited, i, j),count);
                }
            }
        }
        return count;
    }
}
