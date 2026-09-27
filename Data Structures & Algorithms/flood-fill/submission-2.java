class Solution {
    public void dfs(int[][] arr, int r, int c, int color, int start)
    {
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length)
        {
            return;
        }
        if(arr[r][c] != start)
        {
            return;
        }
        arr[r][c] = color;
        dfs(arr,r-1,c,color,start);
        dfs(arr,r,c-1,color,start);
        dfs(arr,r+1,c,color,start);
        dfs(arr,r,c+1,color,start);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
        {
            return image;
        }
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}