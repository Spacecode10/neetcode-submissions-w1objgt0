class Solution {
    public int dfs(int[][] arr,int R, int C, int r, int c)
    {
        if(r == R || c == C)
        {
            return 0;
        }
        if(arr[r][c] != 0)
        {
            return arr[r][c];
        }
        if(r == R -1 && c == C-1)
        {
            return 1;
        }
        int x = dfs(arr,R,C,r+1,c) + dfs(arr,R,C,r,c+1);
        arr[r][c] = x;
        return x;

    }
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return dfs(arr,m,n,0,0);
    }
}
