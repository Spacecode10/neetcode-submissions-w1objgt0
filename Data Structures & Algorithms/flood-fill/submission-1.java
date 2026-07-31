class Solution {
    public void dfs(int[][] arr, int original, int i, int j, int color)
    {
        if(i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != original)
        {
            return;
        }
        arr[i][j] = color;
        dfs(arr,original,i-1,j,color);
        dfs(arr,original,i,j -1,color);
        dfs(arr,original,i+1,j,color);
        dfs(arr,original,i,j+1,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
        return image;
    }
        dfs(image,image[sr][sc],sr,sc,color);
        return image;
    }
}