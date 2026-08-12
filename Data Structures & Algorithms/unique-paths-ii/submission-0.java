class Solution {
    int[][] cache;
    public int dfs(int[][] arr, int i, int j)
    {
        if(i == arr.length || j == arr[0].length || arr[i][j] == 1)
        {
            return 0;
        }
        if(cache[i][j] != 0)
        {
            return cache[i][j];
        }
        if(i == arr.length -1 && j == arr[0].length-1)
        {
            return 1;
        }
        int x = dfs(arr,i+1,j) + dfs(arr,i,j+1);
        cache[i][j] = x;
        return x;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        cache = new int[obstacleGrid.length][obstacleGrid[0].length];
        return dfs(obstacleGrid,0,0);
    }
}