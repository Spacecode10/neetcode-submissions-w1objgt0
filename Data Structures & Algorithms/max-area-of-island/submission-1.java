class Solution {
    private int dfs(int[][] arr, int r, int c)
    {
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length)
        {
            return 0;
        }
        if(arr[r][c] == 0)
        {
            return 0;
        }
        arr[r][c] = 0;
        return dfs(arr,r+1,c) + dfs(arr,r-1,c) + dfs(arr,r,c+1) + dfs(arr,r,c-1) + 1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans  = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    ans = Math.max(dfs(grid,i,j),ans);
                    // System.out.println(ans);
                }
            }
        }
        return ans;
    }
}
